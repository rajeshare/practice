package Strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"}; // O/p "fl"  if its no match all return empty string
    }
    public static String LongestCommonPrefix(String[] str) {
        if (str.length == 0) {
            return "";
        }
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    /*
    TC O(m*n)  SC  O(1)
    {"flower", "flow", "flight"}; // O/p "fl"
     */
}
