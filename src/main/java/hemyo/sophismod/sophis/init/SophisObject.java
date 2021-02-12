package hemyo.sophismod.sophis.init;

import hemyo.sophismod.sophis.Sophis;
import hemyo.sophismod.sophis.init.SophisRarity.Common;
import hemyo.sophismod.sophis.init.object.*;
import hemyo.sophismod.sophis.init.object.FoodItem.FoodCateg;
import hemyo.sophismod.sophis.init.object.MaterialItem.MaterialCateg;
import hemyo.sophismod.sophis.init.uncateg.UncategBlockItem;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
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

    //region [DEFERRED]REGISTRATION
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Sophis.ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Sophis.ID);
    //endregion [DEFERRED]REGISTRATION

    //region [BLOCK]NORMAL
    public static final RegistryObject<OreBlock> COPPER_ORE = SophisBlock.buildOre("copper_ore", Material.ROCK, MaterialColor.BROWN, SoundType.STONE, 3F, 3F, 1);
    public static final RegistryObject<OreBlock> BISMUTH_ORE = SophisBlock.buildOre("bismuth_ore", Material.ROCK, MaterialColor.BLACK, SoundType.STONE, 3F, 3F, 1);
    public static final RegistryObject<OreBlock> UNKNOWN_METAL_ORE = SophisBlock.buildOre("unknown_metal_ore", Material.ROCK, MaterialColor.ADOBE, SoundType.STONE, 3F, 3F, 2);

    public static final RegistryObject<Block> COPPER_BLOCK = SophisBlock.buildBlock("copper_block", Material.ROCK, MaterialColor.BROWN, SoundType.STONE, 3F, 3F, ToolType.PICKAXE, 1, true);
    public static final RegistryObject<Block> BISMUTH_BLOCK = SophisBlock.buildBlock("bismuth_block", Material.ROCK, MaterialColor.BLACK, SoundType.STONE, 3F, 3F, ToolType.PICKAXE, 1, true);
    public static final RegistryObject<Block> TIN_BLOCK = SophisBlock.buildBlock("tin_block", Material.ROCK, MaterialColor.YELLOW, SoundType.STONE, 3F, 3F, ToolType.PICKAXE, 1, true);
    public static final RegistryObject<Block> SILVER_BLOCK = SophisBlock.buildBlock("silver_block", Material.ROCK, MaterialColor.WHITE_TERRACOTTA, SoundType.STONE, 3F, 3F, ToolType.PICKAXE, 3, true);
    //endregion [BLOCK]NORMAL
    //region [ITEM]BLOCK
    public static final RegistryObject<OreItem> COPPER_ORE_I = OreItem.createOreItem(COPPER_ORE, "copper_ore", Common.NORMAL, 10F, 1);
    public static final RegistryObject<OreItem> BISMUTH_ORE_I = OreItem.createOreItem(BISMUTH_ORE, "bismuth_ore", Common.NORMAL, 10F, 1);
    public static final RegistryObject<OreItem> UNKNOWN_METAL_ORE_I = OreItem.createOreItem(UNKNOWN_METAL_ORE, "unknown_metal_ore", Common.SCARCE, 10F, 1);

    public static final RegistryObject<NormalItem> COPPER_BLOCK_I = NormalItem.createNormalItem(COPPER_BLOCK, "copper_block", UncategBlockItem.BlockCateg.METAL, Common.NORMAL, 64, 45F, 2, false);
    public static final RegistryObject<NormalItem> BISMUTH_BLOCK_I = NormalItem.createNormalItem(BISMUTH_BLOCK, "bismuth_block", UncategBlockItem.BlockCateg.METAL, Common.NORMAL, 64, 45F, 2, false);
    public static final RegistryObject<NormalItem> TIN_BLOCK_I = NormalItem.createNormalItem(TIN_BLOCK, "tin_block", UncategBlockItem.BlockCateg.METAL, Common.SCARCE, 64, 90F, 2, false);
    public static final RegistryObject<NormalItem> SILVER_BLOCK_I = NormalItem.createNormalItem(SILVER_BLOCK, "silver_block", UncategBlockItem.BlockCateg.METAL, Common.SCARCE, 64, 90F, 2, false);
    //endregion [ITEM]BLOCK
    //region [ITEM]MATERIAL
    //TODO: Copper is Fire, Iron is Water, Gold is Earth, Bismuth is Air. There are a plenty of "Unknow Ore" which can be mined by gold pickaxe.
    public static final RegistryObject<MaterialItem> COPPER_CLUSTER = MaterialItem.createMaterialItem("copper_cluster", MaterialCateg.MATEL, Common.NORMAL, 64, 5F, 1, false);
    public static final RegistryObject<MaterialItem> IRON_CLUSTER = MaterialItem.createMaterialItem("iron_cluster", MaterialCateg.MATEL, Common.NORMAL, 64, 5F, 1, false);
    public static final RegistryObject<MaterialItem> GOLD_CLUSTER = MaterialItem.createMaterialItem("gold_cluster", MaterialCateg.MATEL, Common.NORMAL, 64, 5F, 1, false);
    public static final RegistryObject<MaterialItem> BISMUTH_CLUSTER = MaterialItem.createMaterialItem("bismuth_cluster", MaterialCateg.MATEL, Common.NORMAL, 64, 5F, 1, false);
    public static final RegistryObject<MaterialItem> UNKNOWN_METAL_CLUSTER = MaterialItem.createMaterialItem("unknown_metal_cluster", MaterialCateg.MATEL, Common.SCARCE, 64, 10F, 0, false);

    public static final RegistryObject<MaterialItem> COPPER_INGOT = MaterialItem.createMaterialItem("copper_ingot", MaterialCateg.MATEL, Common.NORMAL, 64, 5F, 1, false);
    public static final RegistryObject<MaterialItem> BISMUTH_INGOT = MaterialItem.createMaterialItem("bismuth_ingot", MaterialCateg.MATEL, Common.NORMAL, 64, 5F, 1, false);

    public static final RegistryObject<MaterialItem> SILVER_INGOT = MaterialItem.createMaterialItem("silver_ingot", MaterialCateg.MATEL, Common.SCARCE, 64, 10F, 1, false);
    public static final RegistryObject<MaterialItem> TIN_INGOT = MaterialItem.createMaterialItem("tin_ingot", MaterialCateg.MATEL, Common.SCARCE, 64, 10F, 1, false);
    //endregion [ITEM]MATERIAL
    //region [ITEM]FOOD
    public static final RegistryObject<FoodItem> ETHEREAL_FLOWER_SEEDS = FoodItem.createIngredients("ethereal_flower_seeds", FoodCateg.SEED, 0.1F, 0, false);
    //TODO: Ethereal Flower can increase player's MP (decrease player's EP) per a second. However, before instancing this effect, it's a ingredient which can be food or magic material.
    public static final RegistryObject<FoodItem> ETHEREAL_FLOWER = FoodItem.createIngredients("ethereal_flower", FoodCateg.VEGETABLE, 0.1F, 0, false);
    //endregion [ITEM]FOOD

}