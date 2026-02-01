public class TwoPointers {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {15, 11, 7, 2};
        int target = 9;
        int[] ans = twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]); // 1 2
    }
}
