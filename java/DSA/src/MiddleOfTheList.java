public class MiddleOfTheList {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int l = 0, r = array.length - 1;
        while (l < r) {
            ++l;
            --r;
        }
        System.out.println(l +" "+ r);
        for (int i = l; i < array.length; ++i) {
            System.out.println(array[i]);
        }
    }
}
