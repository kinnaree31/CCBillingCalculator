package co.nz.cc.model;

public class Curtain {

    private static long trackWidth;
    private static long curtainLength;
    private static Fabric fabric;
    private static long fullnessRatio;
    private static boolean isPair;
    private static boolean isLined;
    private static boolean isInterlined;
    private static boolean isUnlined;

    public static long getTrackWidth() {
        return trackWidth;
    }

    public static void setTrackWidth(long trackWidth) {
        Curtain.trackWidth = trackWidth;
    }

    public static long getCurtainLength() {
        return curtainLength;
    }

    public static void setCurtainLength(long curtainLength) {
        Curtain.curtainLength = curtainLength;
    }

    public static Fabric getFabric() {
        return fabric;
    }

    public static void setFabric(Fabric fabric) {
        Curtain.fabric = fabric;
    }

    public static long getFullnessRatio() {
        return fullnessRatio;
    }

    public static void setFullnessRatio(long fullnessRatio) {
        Curtain.fullnessRatio = fullnessRatio;
    }

    public static boolean isIsPair() {
        return isPair;
    }

    public static void setIsPair(boolean isPair) {
        Curtain.isPair = isPair;
    }

    public static boolean isIsLined() {
        return isLined;
    }

    public static void setIsLined(boolean isLined) {
        Curtain.isLined = isLined;
    }

    public static boolean isIsInterlined() {
        return isInterlined;
    }

    public static void setIsInterlined(boolean isInterlined) {
        Curtain.isInterlined = isInterlined;
    }

    public static boolean isIsUnlined() {
        return isUnlined;
    }

    public static void setIsUnlined(boolean isUnlined) {
        Curtain.isUnlined = isUnlined;
    }
}
