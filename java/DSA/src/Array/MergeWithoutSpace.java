import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeWithoutSpace {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};

        int l2 = arr2.length;
        int l1 = 0;
        for (int m : arr1) {
            if (m != 0) l1++;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int i = l1 - 1, j = l2 - 1;
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                ans.add(arr1[i]);
                i--;
            } else {
                ans.add(arr2[j]);
                j--;
            }
        }
        while (j >= 0) {
            ans.add(arr2[j--]);
        }
        while (i >= 0) {
            ans.add(arr1[i--]);
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}