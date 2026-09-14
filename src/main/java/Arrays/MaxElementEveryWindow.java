package Arrays;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MaxElementEveryWindow {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 7, 8, 5, 2,4, 6, 17 };  // 7 8 8 9 9 17      [20,3,7]  === 20   [1,3,7,8]  == [1,3,7,8,5,2,4] ==
        int k = 3;
        List<Integer> result = maxSlidingWindow(nums, k);
        System.out.println(result);
    }
    static public class Pair{    // (1,0) (3,1)
        int value;
        int index;
        public Pair(int value,int index) {
            this.value=value;
            this.index=index;
        }

        public String toString() {
            return "("+ value + " , " + index + ")";
        }
    }
    private static List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans = new ArrayList<Integer>();
        PriorityQueue<Pair> heap = new PriorityQueue<Pair>((a, b) -> b.value - a.value);
        for (int i = 0; i < k; i++) {
            heap.offer(new Pair(nums[i], i));
        }
        ans.add(heap.peek().value);
        for (int i = k; i < nums.length; i++) {
            heap.offer(new Pair(nums[i], i));   // add
            Pair p1=heap.peek();
            //System.out.println("( "+p1.value + " , " + p1.index + ")");
            while (heap.peek().index <= i - k) {
                heap.poll();
            }
            ans.add(heap.peek().value);
        }
        //System.out.println(heap);
        return ans;
    }
}
