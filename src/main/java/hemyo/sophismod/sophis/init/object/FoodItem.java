package hemyo.sophismod.sophis.init.object;

import hemyo.sophismod.sophis.init.SophisGroup;
import hemyo.sophismod.sophis.init.SophisObject;
import hemyo.sophismod.sophis.init.SophisRarity.Common;
import hemyo.sophismod.sophis.init.uncateg.UncategNormalItem;
import hemyo.sophismod.sophis.util.ICategorizeGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Rarity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;

public class FoodItem extends UncategNormalItem {

    public enum FoodCateg implements ICategorizeGroup {UNDEFINED, SEED, CROP, FRUIT, VEGETABLE, MEAT, SEAFOOD, MONSTER, CONDIMENT, PROCCESSED, SNACK, DISH}

    private FoodCateg food;

    public FoodItem(Properties properties, FoodCateg food, float kam, int price) {
        super(properties, kam, price);
        this.food = food;
    }
    private static RegistryObject<FoodItem> buildFoodItem(String name, FoodCateg food, Rarity rarity, int hunger, float saturation, int stack, float kam, int price, boolean meat, boolean alwayEdible, boolean fastEating, boolean effect, Effect effectIn, int effectDurationTick, int effectLevel, float effectProbability) {
        Food.Builder foodBuilder = new Food.Builder();
        foodBuilder.hunger(hunger).saturation(saturation);
        if (meat) foodBuilder.meat();
        if (alwayEdible) foodBuilder.setAlwaysEdible();
        if (fastEating) foodBuilder.fastToEat();
        if (effect) foodBuilder.effect(() -> new EffectInstance( effectIn, effectDurationTick, effectLevel), effectProbability);

        return SophisObject.ITEMS.register(name, () -> new FoodItem(new Properties().group(SophisGroup.FOODS).rarity(rarity).maxStackSize(stack).food(foodBuilder.build()), food, kam, price));
    }
    public static RegistryObject<FoodItem> createIngredients(String name, FoodCateg food, float kam, int price, boolean meat) {
        FoodCateg _food = food;
        if (food == FoodCateg.DISH || food == FoodCateg.SNACK) _food = FoodCateg.UNDEFINED;
        return buildFoodItem(name, _food, Common.NORMAL, 1, 0F, 64, kam, price, meat, false, false, false, Effects.SPEED, 0, 0, 0F);
    }
    public static RegistryObject<FoodItem> createNormalFood(String name, FoodCateg food, int hunger, float saturation, float kam, int price, boolean meat, boolean alwayEdible, boolean fastEating) {
        return buildFoodItem(name, food, Common.NORMAL, hunger, saturation, 64, kam, price, meat, alwayEdible, fastEating, false, Effects.SPEED, 0, 0, 0F);
    }
    //TODO: Each EffectFood have own effect, which can't exist at the same time.
    public static RegistryObject<FoodItem> createEffectFood(String name, Rarity rarity, int hunger, float saturation, float kam, int price, Effect effect, int effectDurationTick, int effectLevel, float effectProbability) {
        return buildFoodItem(name, FoodCateg.DISH, rarity, hunger, saturation, 16, kam, price, false, true, false, true, effect, effectDurationTick, effectLevel, effectProbability);
    }
}