package Strings;

public class LongestPolindromeSubstring {
    public static void main(String[] args) {
        String str = "cbbd";
        LongestPolindromeSubstring s = new LongestPolindromeSubstring();
        String result = s.longestPalindrome(str);
        System.out.println(result);
        // aba and bab valid polindrom
    }

    int start = 0, end = 0;

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println("char at "+s.charAt(i)+ " Origin String "+s);
            expandAndAroundCenter(s, i, i);
            System.out.println("substring "+s.substring(start, end + 1));
            if(i<s.length()-1) {
                System.out.println("char at " + s.charAt(i) + " and " + s.charAt(i + 1) + " Origin String " + s);
            }
            expandAndAroundCenter(s, i, i + 1);
            System.out.println("substring "+s.substring(start, end + 1));
        }
        return s.substring(start, end + 1);
    }

    public void expandAndAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        left++;
        right--;
        if (end - start + 1 < right - left + 1) {
            start = left;
            end = right;
        }
    }
}
