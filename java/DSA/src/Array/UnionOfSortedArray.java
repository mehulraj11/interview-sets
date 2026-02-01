import java.util.ArrayList;

public class UnionOfSortedArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 3, 4, 5};
        ArrayList<Integer> newArray = new ArrayList<>();
        int l = 0, r = 0;
        while (l < array1.length && r < array2.length) {
            if (array1[l] == array2[r]) {
                newArray.add(array1[l]);
                l++;
                r++;
            } else if (array1[l] < array2[r]) {
                newArray.add(array1[l]);
                l++;
            } else {
                newArray.add(array2[r]);
                r++;
            }
        }
        while (l < array1.length) {
            newArray.add(array1[l++]);
        }
        while (r < array2.length) {
            newArray.add(array2[r++]);
        }
        for (int i : newArray) {
            System.out.println(i);
        }
    }
}