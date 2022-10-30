package Pois1x.MCProgressionUpgrade;

import Pois1x.MCProgressionUpgrade.Registry.ItemRegistry;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.item.ItemGroup;

public class CreativeTabGroup {

    public static final ItemGroup CREATIVE_TAB = CreativeTabRegistry.create(MCProgressionUpgrade.id(MCProgressionUpgrade.MOD_ID), () -> ItemRegistry.BAMBOO_HALBERD.get().getDefaultStack());

}
