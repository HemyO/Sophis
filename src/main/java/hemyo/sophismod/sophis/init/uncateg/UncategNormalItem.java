package hemyo.sophismod.sophis.init.uncateg;

import net.minecraft.item.Item;

public abstract class UncategNormalItem extends Item implements IUncategItem {

    protected float kam;
    protected int price;
    protected int essentialPrice;
    protected int scrollPrice;
    protected int frameworkPrice;

    public UncategNormalItem(Properties properties, float kam, int price) {
        super(properties);
        this.kam = kam;
        this.price = price;
        if (!(price < 1)) {
            if (price < 64) {
                this.frameworkPrice = 0;
                this.scrollPrice = 0;
                this.essentialPrice = price;
            } else if (price < 4096) {
                this.frameworkPrice = 0;
                this.scrollPrice = price / 64;
                this.essentialPrice = price % 64;
            } else {
                this.frameworkPrice = price / 4096;
                this.scrollPrice = (price - this.frameworkPrice * 4096) / 64;
                this.essentialPrice = price - this.frameworkPrice * 4096 - this.scrollPrice * 64;
            }
        } else {
            this.frameworkPrice = 0;
            this.scrollPrice = 0;
            this.essentialPrice = 0;
        }
    }

    //region [GET]DATA
    public float getKam() {
        return kam;
    }

    public int getPrice() {
        return price;
    }

    public int getEssentialPrice() {
        return essentialPrice;
    }

    public int getScrollPrice() {
        return scrollPrice;
    }

    public int getFrameworkPrice() {
        return frameworkPrice;
    }

    //endregion [GET]DATA
    //region [SET]DATA
    public void setKam(float kam) {
        this.kam = kam;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEssentialPrice(int essentialPrice) {
        this.essentialPrice = essentialPrice;
    }

    public void setScrollPrice(int scrollPrice) {
        this.scrollPrice = scrollPrice;
    }

    public void setFrameworkPrice(int frameworkPrice) {
        this.frameworkPrice = frameworkPrice;
    }
    //endregion [SET]DATA
}