package nl.hen3games.MineTopia.item;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import nl.hen3games.MineTopia.Common.Main;
import nl.hen3games.MineTopia.item.armor.ArmorBase;
import nl.hen3games.MineTopia.library.Refenerce;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gebruiker
 * Date: 22-10-18
 * Time: 2:11
 * To change this template use File | Settings | File Templates.
 */
public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //is verbeterd
    public static final ItemArmor.ArmorMaterial ARMOR_DIRT = EnumHelper.addArmorMaterial("armor_dirt", Refenerce.modId + ":dirt", 2, new int[]{1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_GRIAN_CLAY = EnumHelper.addArmorMaterial("armor_grain_clay", Refenerce.modId + ":grain_clay", 2, new int[]{1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_MAGMA = EnumHelper.addArmorMaterial("armor_magma", Refenerce.modId + ":magma", 2, new int[]{1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_SOUL = EnumHelper.addArmorMaterial("armor_soul", Refenerce.modId + ":soul", 2, new int[]{1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_WATER = EnumHelper.addArmorMaterial("armor_water", Refenerce.modId + ":water", 2, new int[]{1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);

    public static final ItemArmor.ArmorMaterial ARMOR_BLACK_GLASS = EnumHelper.addArmorMaterial("armor_black_glass", Refenerce.modId + ":black_glass", 2, new int[]{1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_BLUE_GLASS = EnumHelper.addArmorMaterial("armor_blue_glass", Refenerce.modId + ":blue_glass", 2, new int[]{1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_BROWN_GLASS = EnumHelper.addArmorMaterial("armor_brown_glass", Refenerce.modId + ":brown_glass", 2, new int[]{1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_CYAN_GLASS = EnumHelper.addArmorMaterial("armor_cyan_glass", Refenerce.modId + ":cyan_glass", 2, new int[]{1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_GRAY_GLASS = EnumHelper.addArmorMaterial("armor_gray_glass", Refenerce.modId + ":gray_glass", 2, new int[]{1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_GREEN_GLASS = EnumHelper.addArmorMaterial("armor_green_glass", Refenerce.modId + ":green_glass", 2, new int[]{1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_IRON_GLASS = EnumHelper.addArmorMaterial("armor_iron_glass", Refenerce.modId + ":iron_glass", 2, new int[]{1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);

    public static final ItemArmor.ArmorMaterial ARMOR_CACTUS = EnumHelper.addArmorMaterial("armor_cactus", Refenerce.modId + ":cactus", 3, new int[]{1, 2, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_LOGOAK = EnumHelper.addArmorMaterial("armor_logoak", Refenerce.modId + ":logoak", 3, new int[]{1, 2, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    //public static final ItemArmor.ArmorMaterial ARMOR_PUMPKIN = EnumHelper.addArmorMaterial("armor_pumpkin", Refenerce.modId + ":pumpkin", 3, new int[]{1, 2, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_SMOOTHWOOD = EnumHelper.addArmorMaterial("armor_smoothwood", Refenerce.modId + ":smoothwood", 3, new int[]{1, 1, 2, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_ICE = EnumHelper.addArmorMaterial("armor_ice", Refenerce.modId + ":ice", 3, new int[]{1, 1, 2, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);

    public static final ItemArmor.ArmorMaterial ARMOR_BRICKS = EnumHelper.addArmorMaterial("armor_bricks", Refenerce.modId + ":bricks", 4, new int[]{1, 2, 2, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_DARKPRISMARINE = EnumHelper.addArmorMaterial("armor_darkprismarine", Refenerce.modId + ":darkprismarine", 4, new int[]{1, 2, 2, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_STONE = EnumHelper.addArmorMaterial("armor_stone", Refenerce.modId + ":stone", 4, new int[]{1, 2, 2, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_STONEBRICK = EnumHelper.addArmorMaterial("armor_stonebrick", Refenerce.modId + ":stonebrick", 4, new int[]{1, 2, 2, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_STONESLAB = EnumHelper.addArmorMaterial("armor_stoneslab", Refenerce.modId + ":stoneslab", 4, new int[]{1, 2, 2, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);

    public static final ItemArmor.ArmorMaterial ARMOR_SPECIAL = EnumHelper.addArmorMaterial("armor_special", Refenerce.modId + ":special", 8, new int[]{2, 2, 2, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);

    public static final ItemArmor.ArmorMaterial ARMOR_COSMIC_GLITTER = EnumHelper.addArmorMaterial("armor_cosmic_glitter", Refenerce.modId + ":cosmic_glitter", 20, new int[]{5, 5, 5, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_COSMIC_PINK = EnumHelper.addArmorMaterial("armor_cosmic_pink", Refenerce.modId + ":cosmic_pink", 20, new int[]{5, 5, 5, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_PINK_COSMIC = EnumHelper.addArmorMaterial("armor_pink_cosmic", Refenerce.modId + ":pink_cosmic", 20, new int[]{5, 5, 5, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_PINK_COSMIC_GLITTER = EnumHelper.addArmorMaterial("armor_pink_cosmic_glitter", Refenerce.modId + ":pink_cosmic_glitter", 20, new int[]{5, 5, 5, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);

    public static final ItemArmor.ArmorMaterial ARMOR_RUSTY_OBSIDIAN = EnumHelper.addArmorMaterial("armor_rusty_obsidian", Refenerce.modId + ":rusty_obsidian", 36, new int[]{8, 9, 10, 8}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    public static final ItemArmor.ArmorMaterial ARMOR_OBSIDIAN = EnumHelper.addArmorMaterial("armor_obsidian", Refenerce.modId + ":obsidian", 38, new int[]{9, 10, 10, 9}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    public static final ItemArmor.ArmorMaterial ARMOR_NETHER_PORTAL = EnumHelper.addArmorMaterial("armor_nether_portal", Refenerce.modId + ":nether_portal", 40, new int[]{10, 10, 10, 10}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    public static final ItemArmor.ArmorMaterial ARMOR_ENDSTONE = EnumHelper.addArmorMaterial("armor_endstone", Refenerce.modId + ":endstone", 44, new int[]{11, 11, 11, 11}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    public static final ItemArmor.ArmorMaterial ARMOR_END_PORTAL = EnumHelper.addArmorMaterial("armor_end_portal", Refenerce.modId + ":end_portal", 45, new int[]{11, 11, 12, 11}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    public static final ItemArmor.ArmorMaterial ARMOR_BEDROCK = EnumHelper.addArmorMaterial("armor_bedrock", Refenerce.modId + ":bedrock", 50, new int[]{12, 13, 13, 12}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);


    public static final Item BEDROCK_HELMET = new ArmorBase("bedrock_helmet", ARMOR_BEDROCK, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item BEDROCK_CHESTPLATE = new ArmorBase("bedrock_chestplate", ARMOR_BEDROCK, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item BEDROCK_LEGGINGS = new ArmorBase("bedrock_leggings", ARMOR_BEDROCK, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item BEDROCK_BOOTS = new ArmorBase("bedrock_boots", ARMOR_BEDROCK, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item BLACK_GLASS_HELMET = new ArmorBase("black_glass_helmet", ARMOR_BLACK_GLASS, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item BLACK_GLASS_CHESTPLATE = new ArmorBase("black_glass_chestplate", ARMOR_BLACK_GLASS, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item BLACK_GLASS_LEGGINGS = new ArmorBase("black_glass_leggings", ARMOR_BLACK_GLASS, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item BLACK_GLASS_BOOTS = new ArmorBase("black_glass_boots", ARMOR_BLACK_GLASS, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item BLUE_GLASS_HELMET = new ArmorBase("blue_glass_helmet", ARMOR_BLUE_GLASS, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item BLUE_GLASS_CHESTPLATE = new ArmorBase("blue_glass_chestplate", ARMOR_BLUE_GLASS, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item BLUE_GLASS_LEGGINGS = new ArmorBase("blue_glass_leggings", ARMOR_BLUE_GLASS, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item BLUE_GLASS_BOOTS = new ArmorBase("blue_glass_boots", ARMOR_BLUE_GLASS, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item BRICKS_HELMET = new ArmorBase("bricks_helmet", ARMOR_BRICKS, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item BRICKS_CHESTPLATE = new ArmorBase("bricks_chestplate", ARMOR_BRICKS, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item BRICKS_LEGGINGS = new ArmorBase("bricks_leggings", ARMOR_BRICKS, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item BRICKS_BOOTS = new ArmorBase("bricks_boots", ARMOR_BRICKS, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item BROWN_GLASS_HELMET = new ArmorBase("brown_glass_helmet", ARMOR_BROWN_GLASS, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item BROWN_GLASS_CHESTPLATE = new ArmorBase("brown_glass_chestplate", ARMOR_BROWN_GLASS, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item BROWN_GLASS_LEGGINGS = new ArmorBase("brown_glass_leggings", ARMOR_BROWN_GLASS, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item BROWN_GLASS_BOOTS = new ArmorBase("brown_glass_boots", ARMOR_BROWN_GLASS, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item CACTUS_HELMET = new ArmorBase("cactus_helmet", ARMOR_CACTUS, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item CACTUS_CHESTPLATE = new ArmorBase("cactus_chestplate", ARMOR_CACTUS, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item CACTUS_LEGGINGS = new ArmorBase("cactus_leggings", ARMOR_CACTUS, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item CACTUS_BOOTS = new ArmorBase("cactus_boots", ARMOR_CACTUS, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item COSMIC_GLITTER_HELMET = new ArmorBase("cosmic_glitter_helmet", ARMOR_COSMIC_GLITTER, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item COSMIC_GLITTER_CHESTPLATE = new ArmorBase("cosmic_glitter_chestplate", ARMOR_COSMIC_GLITTER, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item COSMIC_GLITTER_LEGGINGS = new ArmorBase("cosmic_glitter_leggings", ARMOR_COSMIC_GLITTER, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item COSMIC_GLITTER_BOOTS = new ArmorBase("cosmic_glitter_boots", ARMOR_COSMIC_GLITTER, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item COSMIC_PINK_HELMET = new ArmorBase("cosmic_pink_helmet", ARMOR_COSMIC_PINK, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item COSMIC_PINK_CHESTPLATE = new ArmorBase("cosmic_pink_chestplate", ARMOR_COSMIC_PINK, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item COSMIC_PINK_LEGGINGS = new ArmorBase("cosmic_pink_leggings", ARMOR_COSMIC_PINK, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item COSMIC_PINK_BOOTS = new ArmorBase("cosmic_pink_boots", ARMOR_COSMIC_PINK, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item CYAN_GLASS_HELMET = new ArmorBase("cyan_glass_helmet", ARMOR_CYAN_GLASS, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item CYAN_GLASS_CHESTPLATE = new ArmorBase("cyan_glass_chestplate", ARMOR_CYAN_GLASS, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item CYAN_GLASS_LEGGINGS = new ArmorBase("cyan_glass_leggings", ARMOR_CYAN_GLASS, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item CYAN_GLASS_BOOTS = new ArmorBase("cyan_glass_boots", ARMOR_CYAN_GLASS, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item DARKPRISMARINE_HELMET = new ArmorBase("darkprismarine_helmet", ARMOR_DARKPRISMARINE, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item DARKPRISMARINE_CHESTPLATE = new ArmorBase("darkprismarine_chestplate", ARMOR_DARKPRISMARINE, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item DARKPRISMARINE_LEGGINGS = new ArmorBase("darkprismarine_leggings", ARMOR_DARKPRISMARINE, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item DARKPRISMARINE_BOOTS = new ArmorBase("darkprismarine_boots", ARMOR_DARKPRISMARINE, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item DIRT_HELMET = new ArmorBase("dirt_helmet", ARMOR_DIRT, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item DIRT_CHESTPLATE = new ArmorBase("dirt_chestplate", ARMOR_DIRT, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item DIRT_LEGGINGS = new ArmorBase("dirt_leggings", ARMOR_DIRT, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item DIRT_BOOTS = new ArmorBase("dirt_boots", ARMOR_DIRT, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item END_PORTAL_HELMET = new ArmorBase("end_portal_helmet", ARMOR_END_PORTAL, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item END_PORTAL_CHESTPLATE = new ArmorBase("end_portal_chestplate", ARMOR_END_PORTAL, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item END_PORTAL_LEGGINGS = new ArmorBase("end_portal_leggings", ARMOR_END_PORTAL, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item END_PORTAL_BOOTS = new ArmorBase("end_portal_boots", ARMOR_END_PORTAL, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item ENDSTONE_HELMET = new ArmorBase("endstone_helmet", ARMOR_ENDSTONE, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item ENDSTONE_CHESTPLATE = new ArmorBase("endstone_chestplate", ARMOR_ENDSTONE, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item ENDSTONE_LEGGINGS = new ArmorBase("endstone_leggings", ARMOR_ENDSTONE, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item ENDSTONE_BOOTS = new ArmorBase("endstone_boots", ARMOR_ENDSTONE, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item GRAIN_CLAY_HELMET = new ArmorBase("grain_clay_helmet", ARMOR_GRIAN_CLAY, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item GRAIN_CLAY_CHESTPLATE = new ArmorBase("grain_clay_chestplate", ARMOR_GRIAN_CLAY, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item GRAIN_CLAY_LEGGINGS = new ArmorBase("grain_clay_leggings", ARMOR_GRIAN_CLAY, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item GRAIN_CLAY_BOOTS = new ArmorBase("grain_clay_boots", ARMOR_GRIAN_CLAY, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item GRAY_GLASS_HELMET = new ArmorBase("gray_glass_helmet", ARMOR_GRAY_GLASS, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item GRAY_GLASS_CHESTPLATE = new ArmorBase("gray_glass_chestplate", ARMOR_GRAY_GLASS, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item GRAY_GLASS_LEGGINGS = new ArmorBase("gray_glass_leggings", ARMOR_GRAY_GLASS, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item GRAY_GLASS_BOOTS = new ArmorBase("gray_glass_boots", ARMOR_GRAY_GLASS, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item GREEN_GLASS_HELMET = new ArmorBase("green_glass_helmet", ARMOR_GREEN_GLASS, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item GREEN_GLASS_CHESTPLATE = new ArmorBase("green_glass_chestplate", ARMOR_GREEN_GLASS, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item GREEN_GLASS_LEGGINGS = new ArmorBase("green_glass_leggings", ARMOR_GREEN_GLASS, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item GREEN_GLASS_BOOTS = new ArmorBase("green_glass_boots", ARMOR_GREEN_GLASS, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item ICE_HELMET = new ArmorBase("ice_helmet", ARMOR_ICE, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item ICE_CHESTPLATE = new ArmorBase("ice_chestplate", ARMOR_ICE, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item ICE_LEGGINGS = new ArmorBase("ice_leggings", ARMOR_ICE, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item ICE_BOOTS = new ArmorBase("ice_boots", ARMOR_ICE, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item IRON_GLASS_HELMET = new ArmorBase("iron_glass_helmet", ARMOR_IRON_GLASS, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item IRON_GLASS_CHESTPLATE = new ArmorBase("iron_glass_chestplate", ARMOR_IRON_GLASS, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item IRON_GLASS_LEGGINGS = new ArmorBase("iron_glass_leggings", ARMOR_IRON_GLASS, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item IRON_GLASS_BOOTS = new ArmorBase("iron_glass_boots", ARMOR_IRON_GLASS, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item LOGOAK_HELMET = new ArmorBase("logoak_helmet", ARMOR_LOGOAK, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item LOGOAK_CHESTPLATE = new ArmorBase("logoak_chestplate", ARMOR_LOGOAK, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item LOGOAK_LEGGINGS = new ArmorBase("logoak_leggings", ARMOR_LOGOAK, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item LOGOAK_BOOTS = new ArmorBase("logoak_boots", ARMOR_LOGOAK, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item MAGMA_HELMET = new ArmorBase("magma_helmet", ARMOR_MAGMA, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item MAGMA_CHESTPLATE = new ArmorBase("magma_chestplate", ARMOR_MAGMA, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item MAGMA_LEGGINGS = new ArmorBase("magma_leggings", ARMOR_MAGMA, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item MAGMA_BOOTS = new ArmorBase("magma_boots", ARMOR_MAGMA, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item NETHER_PORTAL_HELMET = new ArmorBase("nether_portal_helmet", ARMOR_NETHER_PORTAL, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item NETHER_PORTAL_CHESTPLATE = new ArmorBase("nether_portal_chestplate", ARMOR_NETHER_PORTAL, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item NETHER_PORTAL_LEGGINGS = new ArmorBase("nether_portal_leggings", ARMOR_NETHER_PORTAL, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item NETHER_PORTAL_BOOTS = new ArmorBase("nether_portal_boots", ARMOR_NETHER_PORTAL, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_OBSIDIAN, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item OBSIDIAN_CHESTPLATE = new ArmorBase("obsidian_chestplate", ARMOR_OBSIDIAN, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item OBSIDIAN_LEGGINGS = new ArmorBase("obsidian_leggings", ARMOR_OBSIDIAN, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_OBSIDIAN, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item PINK_COSMIC_HELMET = new ArmorBase("pink_cosmic_helmet", ARMOR_PINK_COSMIC, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item PINK_COSMIC_CHESTPLATE = new ArmorBase("pink_cosmic_chestplate", ARMOR_PINK_COSMIC, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item PINK_COSMIC_LEGGINGS = new ArmorBase("pink_cosmic_leggings", ARMOR_PINK_COSMIC, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item PINK_COSMIC_BOOTS = new ArmorBase("pink_cosmic_boots", ARMOR_PINK_COSMIC, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item PINK_COSMIC_GLITTER_HELMET = new ArmorBase("pink_cosmic_glitter_helmet", ARMOR_PINK_COSMIC_GLITTER, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item PINK_COSMIC_GLITTER_CHESTPLATE = new ArmorBase("pink_cosmic_glitter_chestplate", ARMOR_PINK_COSMIC_GLITTER, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item PINK_COSMIC_GLITTER_LEGGINGS = new ArmorBase("pink_cosmic_glitter_leggings", ARMOR_PINK_COSMIC_GLITTER, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item PINK_COSMIC_GLITTER_BOOTS = new ArmorBase("pink_cosmic_glitter_boots", ARMOR_PINK_COSMIC_GLITTER, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    //public static final Item PUMPKIN_HELMET = new ArmorBase("pumpkin_helmet", ARMOR_PUMPKIN, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    //public static final Item PUMPKIN_CHESTPLATE = new ArmorBase("pumpkin_chestplate", ARMOR_PUMPKIN, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    //public static final Item PUMPKIN_LEGGINGS = new ArmorBase("pumpkin_leggings", ARMOR_PUMPKIN, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    //public static final Item PUMPKIN_BOOTS = new ArmorBase("pumpkin_boots", ARMOR_PUMPKIN, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item RUSTY_OBSIDIAN_HELMET = new ArmorBase("rusty_obsidian_helmet", ARMOR_RUSTY_OBSIDIAN, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item RUSTY_OBSIDIAN_CHESTPLATE = new ArmorBase("rusty_obsidian_chestplate", ARMOR_RUSTY_OBSIDIAN, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item RUSTY_OBSIDIAN_LEGGINGS = new ArmorBase("rusty_obsidian_leggings", ARMOR_RUSTY_OBSIDIAN, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item RUSTY_OBSIDIAN_BOOTS = new ArmorBase("rusty_obsidian_boots", ARMOR_RUSTY_OBSIDIAN, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item SMOOTHWOOD_HELMET = new ArmorBase("smoothwood_helmet", ARMOR_SMOOTHWOOD, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item SMOOTHWOOD_CHESTPLATE = new ArmorBase("smoothwood_chestplate", ARMOR_SMOOTHWOOD, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item SMOOTHWOOD_LEGGINGS = new ArmorBase("smoothwood_leggings", ARMOR_SMOOTHWOOD, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item SMOOTHWOOD_BOOTS = new ArmorBase("smoothwood_boots", ARMOR_SMOOTHWOOD, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item SOUL_HLEMET = new ArmorBase("soul_helmet", ARMOR_SOUL, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item SOUL_CHESTPLATE = new ArmorBase("soul_chestplate", ARMOR_SOUL, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item SOUL_LEGGINGS = new ArmorBase("soul_leggings", ARMOR_SOUL, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item SOUL_BOOTS = new ArmorBase("soul_boots", ARMOR_SOUL, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item SPECIAL_HELMET = new ArmorBase("special_helmet", ARMOR_SPECIAL, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item SPECIAL_CHESTPLATE = new ArmorBase("special_chestplate", ARMOR_SPECIAL, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item SPECIAl_LEGGINGS = new ArmorBase("special_leggings", ARMOR_SPECIAL, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item SPECIAL_BOOTS = new ArmorBase("special_boots", ARMOR_SPECIAL, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item STONE_HELMET = new ArmorBase("stone_helmet", ARMOR_STONE, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item STONE_CHESTPLATE = new ArmorBase("stone_chestplate", ARMOR_STONE, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item STONE_LEGGINGS = new ArmorBase("stone_leggings", ARMOR_STONE, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item STONE_BOOTS = new ArmorBase("stone_boots", ARMOR_STONE, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item STONEBRICK_HELMET = new ArmorBase("stonebrick_helmet", ARMOR_STONEBRICK, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item STONEBRICK_CHESTPLATE = new ArmorBase("stonebrick_chestplate", ARMOR_STONEBRICK, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item STONEBRICK_LEGGINGS = new ArmorBase("stonebrick_leggings", ARMOR_STONEBRICK, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item STONEBRICK_BOOTS = new ArmorBase("stonebrick_boots", ARMOR_STONEBRICK, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item STONESLAB_HELMET = new ArmorBase("stoneslab_helmet", ARMOR_STONESLAB, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item STONESLAB_CHESTPLATE = new ArmorBase("stoneslab_chestplate", ARMOR_STONESLAB, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item STONESLAB_LEGGINGS = new ArmorBase("stoneslab_leggings", ARMOR_STONESLAB, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item STONESLAB_BOOTS = new ArmorBase("stoneslab_boots", ARMOR_STONESLAB, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    public static final Item WATER_HELMET = new ArmorBase("water_helmet", ARMOR_WATER, 1, EntityEquipmentSlot.HEAD, Main.mthelmettab);
    public static final Item WATER_CHESTPLATE = new ArmorBase("water_chestplate", ARMOR_WATER, 1, EntityEquipmentSlot.CHEST, Main.mtchestplatetab);
    public static final Item WATER_LEGGINGS = new ArmorBase("water_leggings", ARMOR_WATER, 2, EntityEquipmentSlot.LEGS, Main.mtleggingstab);
    public static final Item WATER_BOOTS = new ArmorBase("water_boots", ARMOR_WATER, 1, EntityEquipmentSlot.FEET, Main.mtbootstab);

    //Items
    public static final Item COSMIC_GLITTER_INGOT = new ItemBase("cosmic_glitter_ingot", Main.mtitemstab);
    public static final Item COSMIC_PINK_INGOT = new ItemBase("cosmic_pink_ingot", Main.mtitemstab);
    public static final Item PINK_COSMIC_INGOT = new ItemBase("pink_cosmic_ingot", Main.mtitemstab);
    public static final Item PINK_COSMIC_GLITTER_INGOT = new ItemBase("pink_cosmic_glitter_ingot", Main.mtitemstab);
}
