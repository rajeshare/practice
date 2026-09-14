package Arrays;

public class MajarityElement {
    private static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (candidate == num) ? 1 : -1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3,2,4,2 };
        int result = majorityElement(nums);
        System.out.println("The majority element is: " + result);
    }
}