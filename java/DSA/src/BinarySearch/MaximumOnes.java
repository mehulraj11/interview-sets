package BinarySearch;

public class MaximumOnes {
    public static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[][] array = {
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}
        };
        int n = array.length;
        int m = array[0].length;
        int j = m - 1;
        int rowIndex = -1;
        for (int i = 0; i < n; ++i) {
            while (j >= 0 && array[i][j] == 1) {
                --j;
                rowIndex = i;
            }
        }
        System.out.println("Row with maximum 1s: " + rowIndex);
    }
}
