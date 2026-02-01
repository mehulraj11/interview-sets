public class Subarray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        for (int i = 0; i < array.length; i++) {            // start index
            for (int j = i; j < array.length; j++) {        // end index
                System.out.print("[ ");
                for (int k = i; k <= j; k++) {              // print elements
                    System.out.print(array[k] + " ");
                }
                System.out.print("]");
                System.out.println();
            }
        }
    }
}
