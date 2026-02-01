import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 1, 3};
        Arrays.sort(array);
        int count = 1;
        for (int i = 1; i < array.length; ++i) {
            if (array[i] != array[i - 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
