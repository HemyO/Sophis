package hemyo.sophismod.sophis.init.object;

import hemyo.sophismod.sophis.init.SophisObject;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class SophisBlock {
    public static RegistryObject<Block> buildBlock(String name, Material material, MaterialColor materialColor, SoundType soundType, float hardness, float resistance, ToolType toolType, int level, boolean setTool) {
        if (setTool)
            return SophisObject.BLOCKS.register(name, () -> new Block(AbstractBlock.Properties.create(material, materialColor).hardnessAndResistance(hardness, resistance).harvestTool(toolType).harvestLevel(level).setRequiresTool()));
        return SophisObject.BLOCKS.register(name, () -> new Block(AbstractBlock.Properties.create(material, materialColor).sound(soundType).hardnessAndResistance(hardness, resistance).harvestTool(toolType).harvestLevel(level)));
    }
    public static RegistryObject<OreBlock> buildOre (String name,Material material,MaterialColor materialColor, SoundType soundType, float hardness, float resistance, int level) {
        return  SophisObject.BLOCKS.register(name, () -> new OreBlock(AbstractBlock.Properties.create(material, materialColor).sound(soundType).harvestTool(ToolType.PICKAXE).hardnessAndResistance(hardness, resistance).harvestLevel(level)));
    }
}