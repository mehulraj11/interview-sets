package BinarySearch;

public class Positions {
    public static void main(String[] args) {
        int[] array = {5, 7, 7, 8, 8, 8, 8, 8, 10};
        int target = 9;
        LowerBound lowerBound = new LowerBound();
//        UpperBound upperBound = new UpperBound();
//        int val1 = lowerBound.Lower(array, target);
//        int val2 = upperBound.Upper(array, target);
        int val3 = lowerBound.Lower(array, target);
        System.out.println(val3);
//        System.out.println(val1 + " " + (val2 - 1));
//        System.out.println(val2 - val1);
    }
}
