public class LongestSubarrayWithZeroSum {
    public static void main(String[] args) {
        int[] array = {15, -2, 2, -8, 1, 7, 10, 23};

        int left = 0, right = 0, maxLen = 0, sum = 0;
        while (right < array.length) {
            sum += array[right];

            if (sum > 0) {
                sum -= array[left];
                left++;
            }
            if (sum == 0) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right ++;
        }
        System.out.println(maxLen);
    }
}
