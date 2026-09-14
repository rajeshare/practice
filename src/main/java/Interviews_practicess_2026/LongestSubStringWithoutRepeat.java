package Interviews_practicess_2026;

import java.util.HashSet;

public class LongestSubStringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        /*
            abcabd

         */
        for (int right = 0; right < s.length(); right++) {
            while(set.contains(s.charAt(right))){
                left++;
                set.remove(s.charAt(left));
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;

    }



}
