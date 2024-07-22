package colorcoder;

public class ReferenceManual {
    public static void printManual() {
        System.out.println("Color Code Reference Manual:");
        for (int i = 1; i <= ColorCoder.numberOfMajorColors * ColorCoder.numberOfMinorColors; i++) {
            ColorPair colorPair = ColorCoder.getColorFromPairNumber(i);
            System.out.println(i + " - " + colorPair);
        }
    }
}
