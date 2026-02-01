package BinarySearch;

public class All {
    public static void main(String[] args) {
        int[] array = {5, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
        LowerBound lb = new LowerBound();
        UpperBound ub = new UpperBound();
        int v1 = lb.Lower(array, 7);
        int v2 = ub.Upper(array, 7);
        System.out.println(v2);
        System.out.println(v1);

    }
}
