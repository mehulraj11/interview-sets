public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 2};
        int k = 6;
        int left = 0, right = 0;
        int sum = 0;
        int maxLen = 0;

        while (right < arr.length) {
            sum += arr[right];

            // shrink window if sum > k
            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            // check if sum == k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }

        System.out.println("Longest subarray length = " + maxLen);
    }
}
