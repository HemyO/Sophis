package hemyo.sophismod.sophis.init.object;

import hemyo.sophismod.sophis.init.SophisGroup;
import hemyo.sophismod.sophis.init.SophisObject;
import hemyo.sophismod.sophis.init.uncateg.UncategBlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;

public class NormalItem extends UncategBlockItem {
    private BlockCateg blockCateg;
    public NormalItem(Block blockIn, BlockCateg blockCateg, Properties builder, float kam, int price) {
        super(blockIn, builder, kam, price);
        this.blockCateg = blockCateg;
    }
    public static RegistryObject<NormalItem> createNormalItem (RegistryObject<? extends Block> blockIn, String name, BlockCateg blockCateg, Rarity rarity, int stack, float kam, int price, boolean unburnable) {
        if (unburnable) return SophisObject.ITEMS.register( name, () -> new NormalItem(blockIn.get(), blockCateg, new Properties().group(SophisGroup.BLOCKS).rarity(rarity).maxStackSize(stack).isImmuneToFire(), kam, price));
        return SophisObject.ITEMS.register( name, () -> new NormalItem(blockIn.get(), blockCateg, new Properties().group(SophisGroup.BLOCKS).rarity(rarity).maxStackSize(stack), kam, price));
    }
}
