package Pois1x.MCProgressionUpgrade;

import Pois1x.MCProgressionUpgrade.registry.ItemRegistry;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.item.ItemGroup;

public class CreativeTabGroup {

    public static final ItemGroup CREATIVE_TAB = CreativeTabRegistry.create(MCProgressionUpgrade.id(MCProgressionUpgrade.MOD_ID), () -> ItemRegistry.JUNGLE_HALBERD.get().getDefaultStack());

}
