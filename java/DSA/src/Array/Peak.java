public class Peak {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 5, 6, 4};
        int low = 0, high = array.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] > array[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(array[low]);
    }
}
