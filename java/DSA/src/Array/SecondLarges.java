public class SecondLarges {
    public static void main(String[] args) {
        int[] array = {12, 35, 110, 24, 1};

        int second = -1;
        int large = array[0];

        for (int i = 0; i < array.length; ++i) {
            if (large < array[i]) {
                second = large;
                large = array[i];
            } else if (array[i] > second && array[i] != large) {
                second = array[i];
            }
        }
        System.out.println(second);
    }
}
