package hemyo.sophismod.sophis.init.object;

import hemyo.sophismod.sophis.init.SophisGroup;
import hemyo.sophismod.sophis.init.SophisObject;
import hemyo.sophismod.sophis.init.uncateg.UncategNormalItem;
import hemyo.sophismod.sophis.util.ICategorizeGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;

public class MaterialItem extends UncategNormalItem {
    public enum MaterialCateg implements ICategorizeGroup {MATEL, GEM, CRYSTAL, GRASS, WOOD, LEAF, SKIN, ORGAN, MAGIC, TRAIT, COMPONENT, BRAID, OIL, WILL, ENERGY}

    private MaterialCateg materialCateg;

    public MaterialItem(Properties properties, MaterialCateg materialCateg, float kam, int price) {
        super(properties, kam, price);
        this.materialCateg = materialCateg;
    }
    public static RegistryObject<MaterialItem> createMaterialItem(String name, MaterialCateg materialCateg, Rarity rarity, int stack, float kam, int price, boolean unburnable) {
        if (unburnable) return SophisObject.ITEMS.register(name, () -> new MaterialItem(new Properties().group(SophisGroup.MATERIALS).rarity(rarity).maxStackSize(stack).isImmuneToFire(), materialCateg, kam, price));
        return SophisObject.ITEMS.register(name, () -> new MaterialItem(new Properties().group(SophisGroup.MATERIALS).rarity(rarity).maxStackSize(stack), materialCateg, kam, price));
    }
}
