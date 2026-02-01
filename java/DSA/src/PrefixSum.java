public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] prefixArray = new int[arr.length];

        prefixArray[0] = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }

        for (int i = 0; i < prefixArray.length; i++) {
            System.out.println(prefixArray[i]);
        }
    }
}
