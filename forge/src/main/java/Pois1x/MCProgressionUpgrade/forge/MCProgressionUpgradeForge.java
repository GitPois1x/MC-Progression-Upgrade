package Pois1x.MCProgressionUpgrade.forge;

import dev.architectury.platform.forge.EventBuses;
import Pois1x.MCProgressionUpgrade.MCProgressionUpgrade;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MCProgressionUpgrade.MOD_ID)
public class MCProgressionUpgradeForge {

    public MCProgressionUpgradeForge() {
        // Submit our event bus to let architectury register our content on the right time
        System.out.println("fort");
        EventBuses.registerModEventBus(MCProgressionUpgrade.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        System.out.println("nite");
        MCProgressionUpgrade.init();
        System.out.println("ayo");
    }
}