package Pois1x.MCProgressionUpgrade.registry;

import Pois1x.MCProgressionUpgrade.MCProgressionUpgrade;
import Pois1x.MCProgressionUpgrade.item.MPUArmorMaterials;
import Pois1x.MCProgressionUpgrade.item.MPUToolMaterials;
import Pois1x.MCProgressionUpgrade.item.PickaxeAxeItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;

import static Pois1x.MCProgressionUpgrade.CreativeTabGroup.CREATIVE_TAB;

@SuppressWarnings("unused")
public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MCProgressionUpgrade.MOD_ID, Registry.ITEM_KEY);
    public static final RegistrySupplier<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(MPUArmorMaterials.AMETHYST, EquipmentSlot.HEAD, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(MPUArmorMaterials.AMETHYST, EquipmentSlot.CHEST, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(MPUArmorMaterials.AMETHYST, EquipmentSlot.LEGS, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(MPUArmorMaterials.AMETHYST, EquipmentSlot.FEET, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(MPUToolMaterials.AMETHYST, 3, -2.4F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(MPUToolMaterials.AMETHYST, 1, -2.8F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(MPUToolMaterials.AMETHYST, 5, -3.1F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(MPUToolMaterials.AMETHYST, 1.5F, -3F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(MPUToolMaterials.AMETHYST, -3, -0.5F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ASTRAL_GREATSWORD = ITEMS.register("astral_greatsword", () -> new SwordItem(ToolMaterials.IRON, 1, 1F, new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ASTRAL_PICKAXE_AXE = ITEMS.register("astral_pickaxe_axe", () -> new PickaxeAxeItem(ToolMaterials.IRON, 1, -2.8F, new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> CACTUS_SWORD = ITEMS.register("cactus_sword", () -> new SwordItem(MPUToolMaterials.CACTUS, 3, -2.4F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> CACTUS_PICKAXE = ITEMS.register("cactus_pickaxe", () -> new PickaxeItem(MPUToolMaterials.CACTUS, 1, -2.8F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> CACTUS_AXE = ITEMS.register("cactus_axe", () -> new AxeItem(MPUToolMaterials.CACTUS, 6, -3.2F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> CACTUS_SHOVEL = ITEMS.register("cactus_shovel", () -> new ShovelItem(MPUToolMaterials.CACTUS, 1.5F, -3F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> CACTUS_HOE = ITEMS.register("cactus_hoe", () -> new HoeItem(MPUToolMaterials.CACTUS, 0, -3F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> CINDER_GREATSWORD = ITEMS.register("cinder_greatsword", () -> new SwordItem(ToolMaterials.NETHERITE, 4, -2.4F, new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> CINDER_PICKAXE_AXE = ITEMS.register("cinder_pickaxe_axe", () -> new PickaxeAxeItem(ToolMaterials.NETHERITE, 1, -2.8F, new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(MPUArmorMaterials.COPPER, EquipmentSlot.HEAD, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(MPUArmorMaterials.COPPER, EquipmentSlot.CHEST, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(MPUArmorMaterials.COPPER, EquipmentSlot.LEGS, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(MPUArmorMaterials.COPPER, EquipmentSlot.FEET, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(MPUToolMaterials.COPPER, 3, -2.4F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(MPUToolMaterials.COPPER, 1, -2.8F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(MPUToolMaterials.COPPER, 5, -3.1F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(MPUToolMaterials.COPPER, 1.5F, -3F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(MPUToolMaterials.COPPER, -2, -1F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe", () -> new SwordItem(ToolMaterials.DIAMOND, 12, -3.2F, new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", () -> new SwordItem(ToolMaterials.DIAMOND, 4, -2.4F, new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> DIAMOND_MACE = ITEMS.register("diamond_mace", () -> new SwordItem(ToolMaterials.DIAMOND, 8, -2.8F, new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> DIAMOND_CUTLASS = ITEMS.register("diamond_cutlass", () -> new SwordItem(ToolMaterials.DIAMOND, 0, -1.6F, new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(MPUArmorMaterials.EMERALD, EquipmentSlot.HEAD, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(MPUArmorMaterials.EMERALD, EquipmentSlot.CHEST, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(MPUArmorMaterials.EMERALD, EquipmentSlot.LEGS, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(MPUArmorMaterials.EMERALD, EquipmentSlot.FEET, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(MPUToolMaterials.EMERALD, 3, -2.4F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(MPUToolMaterials.EMERALD, 1, -2.8F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(MPUToolMaterials.EMERALD, 5, -3F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(MPUToolMaterials.EMERALD, 1.5F, -3F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(MPUToolMaterials.EMERALD, -3, 0F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> HELL_BIRD = ITEMS.register("hell_bird", () -> new SwordItem(ToolMaterials.IRON, 4, -2.4F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> IRON_GLAIVE = ITEMS.register("iron_glaive", () -> new SwordItem(ToolMaterials.IRON, 3, -2.4F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> IRON_GREATSWORD = ITEMS.register("iron_greatsword", () -> new SwordItem(ToolMaterials.IRON, 9, -3.2F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> IRON_HALBERD = ITEMS.register("iron_halberd", () -> new SwordItem(ToolMaterials.IRON, 6, -2.8F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> IRON_KATANA = ITEMS.register("iron_katana", () -> new SwordItem(ToolMaterials.IRON, 0, -1.6F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> GOLD_RAPIER = ITEMS.register("gold_rapier", () -> new SwordItem(ToolMaterials.GOLD, 2, -1.6F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BAMBOO_POLE = ITEMS.register("bamboo_pole", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLAZE_HEART = ITEMS.register("blaze_heart", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> HARDWOOD_GREATSWORD = ITEMS.register("hardwood_greatsword", () -> new SwordItem(MPUToolMaterials.HARDWOOD, 3, -2.4F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> HARDWOOD_SWORD = ITEMS.register("hardwood_sword", () -> new SwordItem(MPUToolMaterials.HARDWOOD, 3, -2.4F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> HARDWOOD_PICKAXE = ITEMS.register("hardwood_pickaxe", () -> new PickaxeItem(MPUToolMaterials.HARDWOOD, 1, -2.8F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> HARDWOOD_AXE = ITEMS.register("hardwood_axe", () -> new AxeItem(MPUToolMaterials.HARDWOOD, 6, -3.1F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> HARDWOOD_SHOVEL = ITEMS.register("hardwood_shovel", () -> new ShovelItem(MPUToolMaterials.HARDWOOD, 1.5F, -3F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> HARDWOOD_HOE = ITEMS.register("hardwood_hoe", () -> new HoeItem(MPUToolMaterials.HARDWOOD, -2, -1F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> HARDWOOD_SHIELD = ITEMS.register("hardwood_shield", () -> new ShieldItem(new Item.Settings().maxDamage(2500).group(ItemGroup.COMBAT)));
    public static final RegistrySupplier<Item> ECHO_SWORD = ITEMS.register("echo_sword", () -> new SwordItem(MPUToolMaterials.ECHO, 3, -2.4F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ECHO_PICKAXE = ITEMS.register("echo_pickaxe", () -> new PickaxeItem(MPUToolMaterials.ECHO, 1, -2.8F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ECHO_AXE = ITEMS.register("echo_axe", () -> new AxeItem(MPUToolMaterials.ECHO, 5, -3F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ECHO_SHOVEL = ITEMS.register("echo_shovel", () -> new ShovelItem(MPUToolMaterials.ECHO, 1.5F, -3F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ECHO_HOE = ITEMS.register("echo_hoe", () -> new HoeItem(MPUToolMaterials.ECHO, -3, 0F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BONE_DAGGER = ITEMS.register("bone_dagger", () -> new SwordItem(MPUToolMaterials.BONE, 0, -1.6F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BONE_HALBERD = ITEMS.register("bone_halberd", () -> new SwordItem(MPUToolMaterials.BONE, 6, -2.8F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BONE_PICKAXE = ITEMS.register("bone_pickaxe", () -> new PickaxeItem(MPUToolMaterials.BONE, 0, -2.8F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BONE_SPEAR = ITEMS.register("bone_spear", () -> new SwordItem(MPUToolMaterials.BONE, 3, -2.4F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BONE_GREATSWORD = ITEMS.register("bone_greatsword", () -> new SwordItem(MPUToolMaterials.BONE, 8, -3.2F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> MAGICAL_EXTRACT = ITEMS.register("magical_extract", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> METAL_POLISH = ITEMS.register("metal_polish", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> NETHERITE_CUTLASS = ITEMS.register("netherite_cutlass", () -> new SwordItem(ToolMaterials.NETHERITE, 0, -1.6F, new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", () -> new SwordItem(ToolMaterials.NETHERITE, 5, -2.4F, new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> NETHERITE_MACE = ITEMS.register("netherite_mace", () -> new SwordItem(ToolMaterials.NETHERITE, 10, -2.8F, new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe", () -> new SwordItem(ToolMaterials.NETHERITE, 15, -3.2F, new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> OVERGROWN_BONE_GREATSWORD = ITEMS.register("overgrown_bone_greatsword", () -> new SwordItem(MPUToolMaterials.BONE, 8, -3.2F, new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> POLE = ITEMS.register("pole", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TEARS_OF_THE_UNIVERSE = ITEMS.register("tears_of_the_universe", () -> new Item(new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ZOMBIE_HIDE = ITEMS.register("zombie_hide", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ZOMBIE_LEATHER = ITEMS.register("zombie_leather", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> HARDWOOD = ITEMS.register("hardwood", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));

    public static void init() {
        ITEMS.register();
    }

}
