package Pois1x.MCProgressionUpgrade.item;

import com.google.common.base.Suppliers;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum MPUToolMaterials implements ToolMaterial {

    AMETHYST(3, 931, 8.0F, 3.0F, 9, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    BONE(1, 131, 5.0F, 2.0F, 4, () -> Ingredient.ofItems(Items.BONE)),
    CACTUS(0, 69, 5.0F, 0.0F, 15, () -> Ingredient.ofItems(Items.CACTUS)),
    COPPER(2, 200, 6.0F, 2.0F, 14, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    HARDWOOD(2, 500, 6.0F, 2.0F, 20, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    ECHO(3, 1561, 12.0F, 3.0F, 20, () -> Ingredient.ofItems(Items.ECHO_SHARD)),
    EMERALD(3, 1561, 12.0F, 3.0F, 20, () -> Ingredient.ofItems(Items.EMERALD));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    MPUToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

}
