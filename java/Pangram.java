import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "Hey this is my mobile number";
        s = s.toLowerCase(); // handle uppercase

        int[] freq = new int[26];

        // count only alphabets
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        // check if all letters are present
        boolean isPangram = true;
        for (int i = 0; i < 26; ++i) {
            if (freq[i] == 0) { // missing letter
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("Yes, Pangram");
        } else {
            System.out.println("Not Pangram");
        }

        sc.close();
    }
}
