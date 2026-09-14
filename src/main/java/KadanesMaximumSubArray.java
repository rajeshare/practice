public class KadanesMaximumSubArray {

    public static void main(String[] args) {
        int[] num={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(num));
    }
    public static int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];
        int start=0,end=0;
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], nums[i] + curr);
            max = Math.max(max, curr);
        }
        return max;
    }
}
