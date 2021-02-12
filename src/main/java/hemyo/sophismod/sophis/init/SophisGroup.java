package hemyo.sophismod.sophis.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;

public class SophisGroup{
    public static ItemGroup MATERIALS = createGroup(SophisObject.COPPER_INGOT, "sophis_materials");
    public static ItemGroup FOODS = createGroup(SophisObject.ETHEREAL_FLOWER, "sophis_foods");
    public static ItemGroup BLOCKS = createGroup(SophisObject.COPPER_ORE_I, "sophis_blocks");

    public static ItemGroup createGroup(RegistryObject<? extends IItemProvider> itemIn, String label) {
        return new ItemGroup(label) {
            @OnlyIn(Dist.CLIENT)
            @Override
            public ItemStack createIcon() {
                return new ItemStack(itemIn.get());
            }
        };
    }
}
