public class ZerosAtEnd {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0,1};
        int l = 0, r = 1;
        while (r < array.length) {
            if (array[r] != 0) {
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r++;
            } else  {
                r++;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
