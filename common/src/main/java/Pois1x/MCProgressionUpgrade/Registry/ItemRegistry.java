package Pois1x.MCProgressionUpgrade.Registry;

import Pois1x.MCProgressionUpgrade.MCProgressionUpgrade;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static Pois1x.MCProgressionUpgrade.CreativeTabGroup.CREATIVE_TAB;

@SuppressWarnings("unused")
public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MCProgressionUpgrade.MOD_ID, Registry.ITEM_KEY);

    public static final RegistrySupplier<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ASTRAL_GREATSWORD = ITEMS.register("astral_greatsword", () -> new Item(new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ASTRAL_PICKAXE_AXE = ITEMS.register("astral_pickaxe_axe", () -> new Item(new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> CACTUS_PICKAXE = ITEMS.register("cactus_pickaxe", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> CACTUS_SWORD = ITEMS.register("cactus_sword", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> CINDER_GREATSWORD = ITEMS.register("cinder_greatsword", () -> new Item(new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> CINDER_PICKAXE_AXE = ITEMS.register("cinder_pickaxe_axe", () -> new Item(new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> FETID_BAGHNAKHS = ITEMS.register("fetid_baghnakhs", () -> new Item(new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> FROST_BLADE = ITEMS.register("frost_blade", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> FROST_DAGGER = ITEMS.register("frost_dagger", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> HELL_BIRD = ITEMS.register("hell_bird", () -> new Item(new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> IRON_GLAIVE = ITEMS.register("iron_glaive", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> IRON_GREATSWORD = ITEMS.register("iron_greatsword", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> IRON_HALBERD = ITEMS.register("iron_halberd", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> IRON_KATANA = ITEMS.register("iron_katana", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> JUNGLE_DAGGER = ITEMS.register("jungle_dagger", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> JUNGLE_HALBERD = ITEMS.register("jungle_halberd", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> JUNGLE_PICKAXE = ITEMS.register("jungle_pickaxe", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> JUNGLE_SPEAR = ITEMS.register("jungle_spear", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> JUNGLE_TOOTH = ITEMS.register("jungle_tooth", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> OVERGROWN_JUNGLE_TOOTH = ITEMS.register("overgrown_jungle_tooth", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe", () -> new Item(new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TERRA_BLADE = ITEMS.register("terra_blade", () -> new Item(new Item.Settings().fireproof().group(CREATIVE_TAB)));

    public static final RegistrySupplier<Item> BAMBOO_POLE = ITEMS.register("bamboo_pole", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> POLE = ITEMS.register("pole", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLAZE_EXTRACT = ITEMS.register("blaze_extract", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> DENSE_ICE = ITEMS.register("dense_ice", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> MAGICAL_EXTRACT = ITEMS.register("magical_extract", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> METAL_POLISH = ITEMS.register("metal_polish", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TEARS_OF_THE_UNIVERSE = ITEMS.register("tears_of_the_universe", () -> new Item(new Item.Settings().fireproof().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ZOMBIE_HIDE = ITEMS.register("zombie_hide", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ZOMBIE_LEATHER = ITEMS.register("zombie_leather", () -> new Item(new Item.Settings().group(CREATIVE_TAB)));

    public static void init() {
        ITEMS.register();
    }

}
