public class LeftRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int x = 2;
        int j = 0;
        int[] newArray = new int[array.length];
        for (int i = x; i < array.length; ++i) {
            newArray[j++] = array[i];
        }
        for (int i = 0; i < x; ++i) {
            newArray[j++] = array[i];
        }
        for (int i : newArray) {
            System.out.println(i);
        }
    }
}
