package pinky_amazon;

import java.util.*;

public class Solution {
    public static int minimumSets(Integer[] x, Integer[] y, int k) {
       List<Integer> a= Arrays.asList(x);
        List<Integer> b=Arrays.asList(y);
        List<int[]> intervals = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            intervals.add(new int[]{a.get(i), b.get(i)});
        }
        int minSets = countConnected(intervals);
        // Try all possible new zones within range k
        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= i + k && j <= 100; j++) {
                List<int[]> newIntervals = new ArrayList<>(intervals);
                newIntervals.add(new int[]{i, j});
                int sets = countConnected(newIntervals);
                minSets = Math.min(minSets, sets);
            }
        }
        return minSets;
    }

    private static int countConnected(List<int[]> intervals) {
        intervals.sort(Comparator.comparingInt(arr -> arr[0]));
        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0] - 1) {
                merged.add(new int[]{interval[0], interval[1]});
            } else {
                int[] last = merged.get(merged.size() - 1);
                last[1] = Math.max(last[1], interval[1]);
            }
        }

        return merged.size();
    }

    // You can use this main method to test locally
    public static void main(String[] args) {
        Integer[] a={1, 2, 6, 7, 16};
        Integer[] b = {5, 4, 6, 14, 19};
        int k = 2;
        System.out.println(minimumSets(a, b, k)); // Output: 2
    }
}