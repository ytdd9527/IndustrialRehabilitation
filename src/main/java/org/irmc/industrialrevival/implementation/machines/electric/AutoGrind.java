package org.irmc.industrialrevival.implementation.machines.electric;

import org.bukkit.inventory.ItemStack;
import org.irmc.industrialrevival.api.items.IndustrialRevivalItemStack;
import org.irmc.industrialrevival.api.items.groups.ItemGroup;
import org.irmc.industrialrevival.api.machines.ElectricMachine;
import org.irmc.industrialrevival.api.machines.recipes.MachineRecipes;
import org.irmc.industrialrevival.api.recipes.RecipeType;
import org.jetbrains.annotations.NotNull;

public class AutoGrind extends ElectricMachine {
    public AutoGrind(
            @NotNull ItemGroup group,
            @NotNull IndustrialRevivalItemStack itemStack,
            @NotNull RecipeType recipeType,
            @NotNull ItemStack[] recipe,
            @NotNull MachineRecipes machineRecipes,
            long capacity) {
        super(group, itemStack, recipeType, recipe, machineRecipes, capacity);
    }
}
