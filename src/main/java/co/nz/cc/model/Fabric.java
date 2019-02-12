package co.nz.cc.model;

public class Fabric {


    private static long fabricWidth;
    private static long verticalPatternRepeatInterval;
    private static long horizontalPatternRepeatInterval;

    public static long getFabricWidth() {
        return fabricWidth;
    }

    public static void setFabricWidth(long fabricWidth) {
        Fabric.fabricWidth = fabricWidth;
    }

    public static long getVerticalPatternRepeatInterval() {
        return verticalPatternRepeatInterval;
    }

    public static void setVerticalPatternRepeatInterval(long verticalPatternRepeatInterval) {
        Fabric.verticalPatternRepeatInterval = verticalPatternRepeatInterval;
    }

    public static long getHorizontalPatternRepeatInterval() {
        return horizontalPatternRepeatInterval;
    }

    public static void setHorizontalPatternRepeatInterval(long horizontalPatternRepeatInterval) {
        Fabric.horizontalPatternRepeatInterval = horizontalPatternRepeatInterval;
    }
}
