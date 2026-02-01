public class KadaneAlgo {
    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        int sum = 0, max = Integer.MIN_VALUE, ansStart = -1, ansEnd = -1, start = 0;

        for (int i = 0; i < array.length; ++i) {
            if (sum == 0) start = i;
            sum += array[i];

            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);
        for (int i = ansStart; i <= ansEnd; ++i) {
            System.out.println(array[i]);
        }
    }
}
