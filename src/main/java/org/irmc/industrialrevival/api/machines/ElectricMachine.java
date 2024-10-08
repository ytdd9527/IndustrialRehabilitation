package org.irmc.industrialrevival.api.machines;

import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.irmc.industrialrevival.api.items.IndustrialRevivalItemStack;
import org.irmc.industrialrevival.api.items.attributes.EnergyNetComponent;
import org.irmc.industrialrevival.api.items.groups.ItemGroup;
import org.irmc.industrialrevival.api.items.handlers.BlockTicker;
import org.irmc.industrialrevival.api.machines.recipes.MachineRecipes;
import org.irmc.industrialrevival.api.menu.MachineMenu;
import org.irmc.industrialrevival.api.objects.enums.EnergyNetComponentType;
import org.irmc.industrialrevival.api.recipes.RecipeType;
import org.jetbrains.annotations.NotNull;

/*
 * ElectricMachine is a BasicMachine that consumes energy.
 */
public abstract class ElectricMachine extends BasicMachine implements EnergyNetComponent {
    final long capacity;

    public ElectricMachine(
            @NotNull ItemGroup group,
            @NotNull IndustrialRevivalItemStack itemStack,
            @NotNull RecipeType recipeType,
            @NotNull ItemStack[] recipe,
            @NotNull MachineRecipes machineRecipes,
            long capacity) {
        super(group, itemStack, recipeType, recipe, machineRecipes);
        this.capacity = capacity;
    }

    @Override
    public long getCapacity() {
        return capacity;
    }

    @Override
    public EnergyNetComponentType getComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    @Override
    protected void preRegister() throws Exception {
        addItemHandlers((BlockTicker) (block, menu, data) -> tick(block, menu));
        super.preRegister();
    }

    protected void tick(Block block, MachineMenu menu) {
        // TODO: implement tick logic
    }
}
