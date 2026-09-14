package top20;

import java.util.Arrays;
import java.util.Random;

public class AnagramCheck {
    public static void main(String[] arg) {
        String s1 = "abcd";
        String s2 = "dbca";
        System.out.print(anagramCheck(s1, s2));
    }

    private static boolean anagramCheck(String s1, String s2) {
        int[] counts = new int[26];
        int n = s1.length();
        for (int i = 0; i < n; i++
        ) {
            int tmp = s1.charAt(i) - 'a';
            ++counts[tmp];
        }
        for (int i = 0; i < n; i++
        ) {
            int tmp = s2.charAt(i) - 'a';
            if (counts[tmp] != 0) {
                return false;
            } else {
                --counts[tmp];
            }
        }
        return true;
    }
}
