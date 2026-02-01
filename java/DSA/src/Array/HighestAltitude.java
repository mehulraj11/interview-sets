public class HighestAltitude {
    public static int calculate(int[] gain) {
        int n = gain.length;
        int[] prefixSum = new int[n + 1];
        int max = 0;
        prefixSum[0] = 0;
        for (int i = 1; i < n; ++i) {
            prefixSum[i] = prefixSum[i - 1] + gain[i-1];
            max = Math.max(max, prefixSum[i]);
        }
        for (int i = 0; i < prefixSum.length; ++i) {
            System.out.println(prefixSum[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(calculate(gain));
    }
}
