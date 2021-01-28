package hemyo.sophismod.sophis.methods;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.*;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class QuickRegistration {
    public static RegistryObject<Item> createItem (DeferredRegister<Item> register, String name, ItemGroup group, Rarity rarity, int maxStack, boolean unburnable) {
        Item.Properties data = new Properties();

        data.group(group);
        data.rarity(rarity);
        data.maxStackSize(maxStack);
        if (unburnable) data.isImmuneToFire();

        return register.register(name, () -> new Item(data));
    }
    public static RegistryObject<Item> createFood (DeferredRegister<Item> register, String name, ItemGroup group, Rarity rarity, int maxStack, int hunger, int saturation, boolean meat, boolean alwaysEdiable, boolean fastToEat) {
        Item.Properties data = new Item.Properties();
        Food.Builder foodData = new Food.Builder();

        foodData.hunger(hunger);
        foodData.saturation(saturation);
        if (meat) foodData.meat();
        if (alwaysEdiable) foodData.setAlwaysEdible();
        if (fastToEat) foodData.fastToEat();

        Food food= foodData.build();

        data.group(group);
        data.rarity(rarity);
        data.maxStackSize(maxStack);
        data.food(food);

        return register.register(name, () -> new Item(data));
    }
    public static RegistryObject<Block> createBlock (DeferredRegister<Block> register, String name, Material material, MaterialColor color, float hardness, float resistance, ToolType tool, int level, SoundType sound) {
        AbstractBlock.Properties data = AbstractBlock.Properties.create(material, color);

        data.hardnessAndResistance(hardness, resistance);
        if (tool != null) data.harvestTool(tool);
        data.harvestLevel(level);
        data.sound(sound);

        return register.register(name, () -> new Block(data));
    }
    public static RegistryObject<Item> createBlockItem (DeferredRegister<Item> register, RegistryObject<Block> block, String name, ItemGroup group, Rarity rarity, int maxStack, boolean unburnable) {
        Item.Properties data = new Properties();

        data.group(group);
        data.rarity(rarity);
        data.maxStackSize(maxStack);
        if (unburnable) data.isImmuneToFire();

        return register.register(name, () -> new BlockItem(block.get(), data));
    }
}