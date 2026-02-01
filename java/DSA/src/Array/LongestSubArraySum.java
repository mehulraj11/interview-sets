import java.util.*;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println("Longest Subarray Length = " + longestSubarraySum(arr, k));
    }

    public static int longestSubarraySum(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == k)
                maxLen = i + 1;

            if (map.containsKey(prefixSum - k))
                maxLen = Math.max(maxLen, i - map.get(prefixSum - k));

            // store prefix sum only if not present
            map.putIfAbsent(prefixSum, i);
        }

        return maxLen;
    }
}
