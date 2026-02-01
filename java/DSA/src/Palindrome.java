public class Palindrome {
    public static boolean palindrome(String s) {
        char[] arr = s.toCharArray();

        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (arr[l] != arr[r]) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "amanaplanacanalpanaa";
        System.out.println(palindrome(s));
    }
}
