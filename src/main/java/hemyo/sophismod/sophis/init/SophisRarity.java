package hemyo.sophismod.sophis.init;

import net.minecraft.item.Rarity;
import net.minecraft.util.text.TextFormatting;

public class SophisRarity {
    public static class Common {
        public static final Rarity NORMAL = Rarity.create("normal", TextFormatting.WHITE);
        public static final Rarity SCARCE = Rarity.create("scarce", TextFormatting.AQUA);
        public static final Rarity EPIC = Rarity.create("epic", TextFormatting.RED);
    }
    public static class Smithing {
        public static final Rarity ARTISANAL = Rarity.create("artisanal", TextFormatting.YELLOW);
        public static final Rarity LEGENDARY = Rarity.create("legendary", TextFormatting.GOLD);
        public static final Rarity RELIC = Rarity.create("relic", TextFormatting.GREEN);
    }
    public static class Special {
        public static final Rarity QUEST = Rarity.create("quest", TextFormatting.DARK_PURPLE);
        public static final Rarity TRASH = Rarity.create("trash", TextFormatting.GRAY);
        public static final Rarity CREATIVE = Rarity.create("creative", TextFormatting.BOLD);
    }
}
