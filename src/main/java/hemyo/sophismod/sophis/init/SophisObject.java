package hemyo.sophismod.sophis.init;

import hemyo.sophismod.sophis.Sophis;
import hemyo.sophismod.sophis.init.SophisGroup.Blocks;
import hemyo.sophismod.sophis.init.SophisGroup.Food;
import hemyo.sophismod.sophis.init.SophisGroup.Materials;
import hemyo.sophismod.sophis.init.SophisRarity.Normal;
import hemyo.sophismod.sophis.methods.QuickRegistration;
import hemyo.sophismod.sophis.methods.ValSet;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@EventBusSubscriber(modid = Sophis.ID, bus = Bus.MOD)
public class SophisObject {

    public SophisObject() {

    }
    //REGISTRATION Area.
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Sophis.ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Sophis.ID);

    //BLOCKS-DECORATIONS Area.
    //BLOCKS-BLOCKS Area.
    //ORE BLOCK
    public static final RegistryObject<Block> COPPER_ORE_BLOCK = QuickRegistration.createBlock(BLOCKS, "copper_ore_block", Material.ROCK, MaterialColor.GRAY, 3.0F, 15.0F, ToolType.PICKAXE, 1, SoundType.STONE);
    public static final RegistryObject<Block> TIN_ORE_BLOCK = QuickRegistration.createBlock(BLOCKS, "tin_ore_block", Material.ROCK, MaterialColor.GRAY, 3.0F, 15.0F, ToolType.PICKAXE, 1, SoundType.STONE);
    public static final RegistryObject<Block> IRON_ORE_BLOCK = QuickRegistration.createBlock(BLOCKS, "iron_ore_block", Material.ROCK, MaterialColor.GRAY, 3.0F, 15.0F, ToolType.PICKAXE, 1, SoundType.STONE);
    public static final RegistryObject<Block> GOLD_ORE_BLOCK = QuickRegistration.createBlock(BLOCKS, "gold_ore_block", Material.ROCK, MaterialColor.GRAY, 3.0F, 15.0F, ToolType.PICKAXE, 2, SoundType.STONE);
    public static final RegistryObject<Block> SILVER_ORE_BLOCK = QuickRegistration.createBlock(BLOCKS, "silver_ore_block", Material.ROCK, MaterialColor.GRAY, 3.0F, 15.0F, ToolType.PICKAXE, 2, SoundType.STONE);
    public static final RegistryObject<Block> BISMUTH_ORE_BLOCK = QuickRegistration.createBlock(BLOCKS, "bismuth_ore_block", Material.ROCK, MaterialColor.GRAY, 3.0F, 15.0F, ToolType.PICKAXE, 2, SoundType.STONE);
    public static final RegistryObject<Block> COPPER_BLOCK = QuickRegistration.createBlock(BLOCKS, "copper_block", Material.IRON, MaterialColor.GRAY, 10.0F, 30.0F, ToolType.PICKAXE, 1, SoundType.METAL);
    public static final RegistryObject<Block> TIN_BLOCK = QuickRegistration.createBlock(BLOCKS, "tin_block", Material.IRON, MaterialColor.GRAY, 10.0F, 30.0F, ToolType.PICKAXE, 1, SoundType.METAL);
    public static final RegistryObject<Block> IRON_BLOCK = QuickRegistration.createBlock(BLOCKS, "iron_block", Material.IRON, MaterialColor.GRAY, 10.0F, 30.0F, ToolType.PICKAXE, 1, SoundType.METAL);
    public static final RegistryObject<Block> GOLD_BLOCK = QuickRegistration.createBlock(BLOCKS, "gold_block", Material.IRON, MaterialColor.GRAY, 10.0F, 30.0F, ToolType.PICKAXE, 2, SoundType.METAL);
    public static final RegistryObject<Block> SILVER_BLOCK = QuickRegistration.createBlock(BLOCKS, "silver_block", Material.IRON, MaterialColor.GRAY, 10.0F, 30.0F, ToolType.PICKAXE, 2, SoundType.METAL);
    public static final RegistryObject<Block> BISMUTH_BLOCK = QuickRegistration.createBlock(BLOCKS, "bismuth_block", Material.IRON, MaterialColor.GRAY, 10.0F, 30.0F, ToolType.PICKAXE, 2, SoundType.METAL);
    //BUILDING BLOCK
    //BLOCKS-FUNCTION_BLOCKS Area.
    //ITEMS-BLOCKS Area.
    //ORE BLOCK
    public static final RegistryObject<Item> COPPER_ORE_BLOCKITEM = QuickRegistration.createBlockItem(ITEMS, COPPER_ORE_BLOCK, "copper_ore_block", Blocks.BLOCKS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> TIN_ORE_BLOCKITEM = QuickRegistration.createBlockItem(ITEMS, TIN_ORE_BLOCK, "tin_ore_block", Blocks.BLOCKS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> IRON_ORE_BLOCKITEM = QuickRegistration.createBlockItem(ITEMS, IRON_ORE_BLOCK, "iron_ore_block", Blocks.BLOCKS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> GOLD_ORE_BLOCKITEM = QuickRegistration.createBlockItem(ITEMS, GOLD_ORE_BLOCK, "gold_ore_block", Blocks.BLOCKS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> SILVER_ORE_BLOCKITEM = QuickRegistration.createBlockItem(ITEMS, SILVER_ORE_BLOCK, "silver_ore_block", Blocks.BLOCKS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> BISMUTH_ORE_BLOCKITEM = QuickRegistration.createBlockItem(ITEMS, BISMUTH_ORE_BLOCK, "bismuth_ore_block", Blocks.BLOCKS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> COPPER_BLOCK_BLOCKITEM = QuickRegistration.createBlockItem(ITEMS, COPPER_BLOCK, "copper_block", Blocks.BLOCKS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> TIN_BLOCK_BLOCKITEM = QuickRegistration.createBlockItem(ITEMS, TIN_BLOCK, "tin_block", Blocks.BLOCKS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> IRON_BLOCK_BLOCKITEM = QuickRegistration.createBlockItem(ITEMS, IRON_BLOCK, "iron_block", Blocks.BLOCKS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> GOLD_BLOCK_BLOCKITEM = QuickRegistration.createBlockItem(ITEMS, GOLD_BLOCK, "gold_block", Blocks.BLOCKS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> SILVER_BLOCK_BLOCKITEM = QuickRegistration.createBlockItem(ITEMS, SILVER_BLOCK, "silver_block", Blocks.BLOCKS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> BISMUTH_BLOCK_BLOCKITEM = QuickRegistration.createBlockItem(ITEMS, BISMUTH_BLOCK, "bismuth_block", Blocks.BLOCKS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    //BUILDING BLOCK
    //ITEMS-MATERIALS Area.
    //region
    //endregion
    //ORE MATERIAL
    public static final RegistryObject<Item> COPPER_ORE = QuickRegistration.createItem(ITEMS, "copper_ore", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> TIN_ORE = QuickRegistration.createItem(ITEMS, "tin_ore", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> IRON_ORE = QuickRegistration.createItem(ITEMS, "iron_ore", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> SILVER_ORE = QuickRegistration.createItem(ITEMS, "silver_ore", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> GOLD_ORE = QuickRegistration.createItem(ITEMS, "gold_ore", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> BISMUTH_ORE = QuickRegistration.createItem(ITEMS, "bismuth_ore", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    //INGOT MATERIAL
    public static final RegistryObject<Item> COPPER_INGOT = QuickRegistration.createItem(ITEMS, "copper_ingot", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> TIN_INGOT = QuickRegistration.createItem(ITEMS, "tin_ingot", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> IRON_INGOT = QuickRegistration.createItem(ITEMS, "iron_ingot", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> SILVER_INGOT = QuickRegistration.createItem(ITEMS, "silver_ingot", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> GOLD_INGOT = QuickRegistration.createItem(ITEMS, "gold_ingot", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> BISMUTH_INGOT = QuickRegistration.createItem(ITEMS, "bismuth_ingot", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    //MANABLE MATERIAL
    public static final RegistryObject<Item> ETHEREAL_FLOWER_SEEDS = QuickRegistration.createItem(ITEMS, "ethereal_flower_seeds", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> ETHEREAL_FLOWER = QuickRegistration.createItem(ITEMS, "ethereal_flower", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, false);
    public static final RegistryObject<Item> MANA_ETHEREAL_FLOWER = QuickRegistration.createItem(ITEMS, "mana_ethereal_flower", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, true);
    public static final RegistryObject<Item> MANA_ASHES = QuickRegistration.createItem(ITEMS, "mana_ashes", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, true);
    public static final RegistryObject<Item> MANA_CRYSTAL = QuickRegistration.createItem(ITEMS, "mana_crystal", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, true);
    public static final RegistryObject<Item> COMPRESSED_MANA_CRYSTAL = QuickRegistration.createItem(ITEMS, "compressed_mana_crystal", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, true);
    public static final RegistryObject<Item> FULL_MANA_CRYSTAL = QuickRegistration.createItem(ITEMS, "full_mana_crystal", Materials.MATERIALS, Normal.NORMAL, ValSet.Stack.OCT_8X, true);

    //ITEMS-FOOD Area.
    //SPICES FOOD
    //FRUIT FOOD
    public static final RegistryObject<Item> COFFEE_CHERRY = QuickRegistration.createFood(ITEMS, "coffee_cherry", Food.FOOD, Normal.NORMAL, 64, 1, 0, false, true, true);
    public static final RegistryObject<Item> COFFEE_BEAN = QuickRegistration.createFood(ITEMS, "coffee_bean", Food.FOOD, Normal.NORMAL, 64, 1, 1, false, true, true);
    //VEGETABLE FOOD
    //GRAIN FOOD
    //MEAT FOOD
    //EGG FOOD
    //SPRING FOOD
    //SALAD FOOD
    //DISHES FOOD

    //ITEMS-TOOL Area.
    //ITEMS-ARMOR Area.
    //ITEMS-WEAPON Area.
    //ITEMS-CORP Area.
    //ITEMS-DECORATIONS Area.

    //ITEMS-ENTITIES Area.
    //ITEMS-FUNCTION_BLOCKS Area.


}
