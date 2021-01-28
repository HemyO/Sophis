package hemyo.sophismod.sophis.methods;

public class ValSet {
    public static class Stack {
        public static final int OCT_1X;
        public static final int OCT_2X;
        public static final int OCT_4X;
        public static final int OCT_8X;

        static {
            //1X=8
            OCT_1X = 8;
            //2X=16
            OCT_2X = OCT_1X * 2;
            //4X=32
            OCT_4X = OCT_2X * 2;
            //8X=64
            OCT_8X = OCT_4X * 2;
        }
    }
}
