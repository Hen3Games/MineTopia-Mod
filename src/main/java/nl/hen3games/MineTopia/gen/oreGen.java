package nl.hen3games.MineTopia.gen;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import nl.hen3games.MineTopia.block.ModBlock;

import java.util.Random;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: brugg
 * Date: 19-2-19
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */
public class oreGen implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.getDimension()) {
            //Nether
            case -1:
                break;
            //Overworld
            case 0:
                runGenerator(ModBlock.COSMIC_GLITTER_ORE.getDefaultState(), 7, 10, 12, 50, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
                runGenerator(ModBlock.PINK_COSMIC_GLITTER_ORE.getDefaultState(), 7, 10, 12, 50, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
                break;
            //End
            case 1:
                break;
            //Everything else
            default:
                break;
        }
    }

    private void runGenerator(IBlockState blockToGen, int blockAmount,  int chancesToSpawn, int minHeight, int maxHeight, Predicate<IBlockState> blockToReplace, World world, Random rand, int chunk_X, int chunk_Z){

        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        WorldGenMinable generator = new WorldGenMinable(blockToGen, blockAmount, (com.google.common.base.Predicate<IBlockState>) blockToReplace);
        int heightdiff = maxHeight - minHeight +1;
        for (int i=0; i<chancesToSpawn; i++){
            int x = chunk_X * 16 +rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightdiff);
            int z = chunk_Z * 16 + rand.nextInt(16);

            generator.generate(world, rand, new BlockPos(x, y, z));
        }
    }

}
