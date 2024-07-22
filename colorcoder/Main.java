package colorcoder;

public class Main {
    public static void main(String[] args) {
        ColorCoder.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorCoder.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
        ColorCoder.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorCoder.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
        ReferenceManual.printManual();
    }
}
