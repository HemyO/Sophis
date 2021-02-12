package hemyo.sophismod.sophis.init.object;

import hemyo.sophismod.sophis.init.SophisGroup;
import hemyo.sophismod.sophis.init.SophisObject;
import hemyo.sophismod.sophis.init.uncateg.UncategBlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;

public class OreItem extends UncategBlockItem {
    private BlockCateg blockCateg;
    public OreItem(Block blockIn,BlockCateg blockCateg, Properties builder, float kam, int price) {
        super(blockIn, builder, kam, price);
        this.blockCateg = blockCateg;
    }
    public static RegistryObject<OreItem> createOreItem (RegistryObject<? extends Block> blockIn,String name, Rarity rarity, float kam, int price) {
        return SophisObject.ITEMS.register( name, () -> new OreItem(blockIn.get(), BlockCateg.METAL, new Properties().group(SophisGroup.BLOCKS).rarity(rarity).maxStackSize(64), kam, price));
    }
}
