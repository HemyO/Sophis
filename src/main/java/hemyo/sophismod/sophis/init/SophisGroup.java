package hemyo.sophismod.sophis.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class SophisGroup {
    public static class Materials extends ItemGroup {
        private final Supplier<ItemStack> displayIcon;
        public static final Materials MATERIALS = new Materials ("sophis_materials", () -> new ItemStack(SophisObject.COPPER_INGOT.get()));
        private Materials (String label, Supplier<ItemStack> icon) {
            super(label);
            this.displayIcon = icon;
        }
        @OnlyIn(Dist.CLIENT)
        @Override
        public @NotNull ItemStack createIcon() { return displayIcon.get(); }
    }
    public static class Food extends ItemGroup {
        private final Supplier<ItemStack> displayIcon;
        public static final Food FOOD = new Food ("sophis_food", () -> new ItemStack(SophisObject.COFFEE_BEAN.get()));
        private Food (String label, Supplier<ItemStack> icon) {
            super(label);
            this.displayIcon = icon;
        }
        @OnlyIn(Dist.CLIENT)
        @Override
        public @NotNull ItemStack createIcon() { return displayIcon.get(); }
    }
    public static class Blocks extends ItemGroup {
        private final Supplier<ItemStack> displayIcon;
        public static final Blocks BLOCKS = new Blocks("sophis_blocks", () -> new ItemStack(SophisObject.COPPER_ORE_BLOCKITEM.get()));
        private Blocks (String label, Supplier<ItemStack> icon) {
            super(label);
            this.displayIcon = icon;
        }
        @OnlyIn(Dist.CLIENT)
        @Override
        public @NotNull ItemStack createIcon() {return displayIcon.get(); }
    }
    public static class GuidelineBooks extends ItemGroup {
        private final Supplier<ItemStack> displayIcon;
        public static final GuidelineBooks GUIDELINE_BOOKS = new GuidelineBooks("sophis_guideline_books", () -> new ItemStack(SophisObject.COPPER_ORE_BLOCKITEM.get()));
        private GuidelineBooks (String label, Supplier<ItemStack> icon) {
            super(label);
            this.displayIcon = icon;
        }
        @OnlyIn(Dist.CLIENT)
        @Override
        public @NotNull ItemStack createIcon() {return displayIcon.get(); }
    }
}
