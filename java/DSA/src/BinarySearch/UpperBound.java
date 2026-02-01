package BinarySearch;

public class UpperBound {
    public int Upper(int[] array, int target) {

        int low = 0, high = array.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
