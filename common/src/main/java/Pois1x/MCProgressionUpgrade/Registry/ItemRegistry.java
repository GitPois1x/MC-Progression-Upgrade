package Pois1x.MCProgressionUpgrade.Registry;

import Pois1x.MCProgressionUpgrade.MCProgressionUpgrade;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unused")
public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MCProgressionUpgrade.MOD_ID, Registry.ITEM_KEY);
    public static RegistrySupplier<Item> BAMBOO_HALBERD = ITEMS.register("bamboo_halberd", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> BAMBOO_SPEAR = ITEMS.register("bamboo_spear", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> BAMBOO_POLE = ITEMS.register("bamboo_pole", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> BLAZE_EXTRACT = ITEMS.register("blaze_extract", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> CACTUS_PICKAXE = ITEMS.register("cactus_pickaxe", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> CACTUS_SWORD = ITEMS.register("cactus_sword", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> DENSE_ICE = ITEMS.register("dense_ice", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> FETID_BAGHNAKHS = ITEMS.register("fetid_baghnakhs", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> FROST_BLADE = ITEMS.register("frost_blade", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> FROST_DAGGER = ITEMS.register("frost_dagger", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> HELL_BIRD = ITEMS.register("hell_bird", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> IRON_GLAIVE = ITEMS.register("iron_glaive", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> IRON_GREATSWORD = ITEMS.register("iron_greatsword", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> IRON_HALBERD = ITEMS.register("iron_helberd", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> IRON_KATANA = ITEMS.register("iron_katana", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> MAGICAL_EXTRACT = ITEMS.register("magical_extract", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> METAL_POLISH = ITEMS.register("metal_polish", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> OVERGROWN_THE_TOOTH = ITEMS.register("overgrown_the_tooth", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> POLE = ITEMS.register("pole", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> TEARS_OF_THE_UNIVERSE = ITEMS.register("tears_of_the_universe", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> TERRA_BLADE = ITEMS.register("terra_blade", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> THE_TOOTH = ITEMS.register("the_tooth", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> ZOMBIE_HIDE = ITEMS.register("zombie_hide", () -> new Item(new Item.Settings()));
    public static RegistrySupplier<Item> ZOMBIE_LEATHER = ITEMS.register("zombie_leather", () -> new Item(new Item.Settings()));

    public static void init() {
        ITEMS.register();
    }

}
