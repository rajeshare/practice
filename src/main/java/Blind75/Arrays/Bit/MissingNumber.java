package Blind75.Arrays.Bit;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,4,1,0};
        int res = missingNumber(arr);
        System.out.print(res);
    }
    public  static int missingNumber(int[] nums){
        int xor = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            xor ^= i ^ nums[i];
        }
        return xor ^ n;
    }
}
