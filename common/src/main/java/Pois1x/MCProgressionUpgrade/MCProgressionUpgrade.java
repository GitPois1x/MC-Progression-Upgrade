package Pois1x.MCProgressionUpgrade;

import Pois1x.MCProgressionUpgrade.Registry.ItemRegistry;
import net.minecraft.util.Identifier;

public class MCProgressionUpgrade {

    public static final String MOD_ID = "mc_progression_upgrade";
    public static Identifier id(String name) {
        return new Identifier(MOD_ID, name);
    }

    public static void init() {
        ItemRegistry.init();
    }
}