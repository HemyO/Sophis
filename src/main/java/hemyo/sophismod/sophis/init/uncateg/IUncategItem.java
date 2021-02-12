package hemyo.sophismod.sophis.init.uncateg;

public interface IUncategItem {
    //region [GET]DATA
    float getKam();
    int getPrice();
    int getEssentialPrice();
    int getScrollPrice();
    int getFrameworkPrice();
    //endregion [GET]DATA
    //region [SET]DATA
    void setKam(float kam);
    void setPrice(int price);
    void setEssentialPrice(int essentialPrice);
    void setScrollPrice(int scrollPrice);
    void setFrameworkPrice(int frameworkPrice);
    //endregion [SET]DATA
}
