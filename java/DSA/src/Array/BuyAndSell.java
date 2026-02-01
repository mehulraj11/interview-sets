public class BuyAndSell {
    public static void main(String[] args) {
        int[] array = {2,4, 1};
        int min = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < min) {
                min = array[i];
//                max = min;
            } else{
                maxProfit = Math.max(maxProfit, array[i]- min);
            }
        }
        System.out.println(maxProfit);
    }
}