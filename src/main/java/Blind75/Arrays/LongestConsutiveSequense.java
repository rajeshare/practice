package Blind75.Arrays;

import java.util.HashSet;

public class LongestConsutiveSequense {
    public static void main(String[] args) {
        int[] nums={100,4,200,1,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> setValues = new HashSet<Integer>();
        for (Integer num : nums) {
            setValues.add(num);
        }
        int maxLength = 0;
        for (Integer num : setValues) {
            if (!setValues.contains(num - 1)) {
                int current = num;
                int streak = 1;
                while (setValues.contains(current + 1)) {
                    current++;
                    streak++;
                }
                maxLength = Math.max(maxLength, streak);
            }
        }
        return maxLength;
    }
}

