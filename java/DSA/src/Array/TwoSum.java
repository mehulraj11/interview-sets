public class TwoSum {
    public static int[] sum(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] == target) {
                return new int[]{left, right};
            }
            if (array[left] + array[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array = {11, 7, 2, 15, 6};
        int[] ans = sum(array, 18);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
