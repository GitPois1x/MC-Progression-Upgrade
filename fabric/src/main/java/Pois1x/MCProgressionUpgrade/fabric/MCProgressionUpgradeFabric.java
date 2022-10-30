package Pois1x.MCProgressionUpgrade.fabric;

import Pois1x.MCProgressionUpgrade.MCProgressionUpgrade;
import net.fabricmc.api.ModInitializer;

public class MCProgressionUpgradeFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        MCProgressionUpgrade.init();
    }
}