package Strings;

public class Isomorphic {
    public static boolean ans(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[128];
        int[] mapT = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapS[c1] != mapT[c2]) return false;

            mapS[c1] = i + 1;
            mapT[c2] = i + 1;
        }
        return true;
    }
}
