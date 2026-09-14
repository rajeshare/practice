package Blind75.Arrays;

import java.util.Arrays;

public class ProductOfAllExceptSelf {

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
         int[] res=ProductOfAllExceptSelf(nums);
         Arrays.stream(res).forEach(x->System.out.println(x));
        }

    private static int[] ProductOfAllExceptSelf(int[] nums) {
        int[] prefixProduct=new int[nums.length];
        int[] suffixProduct=new int[nums.length];
        prefixProduct[0]=1;
        suffixProduct[nums.length-1]=1;
        for(int i = 1; i< nums.length; i++){
            prefixProduct[i]=  prefixProduct[i-1]*nums[i-1];
        }
        int suffixProduct1=1;
        for(int j = nums.length-1; j>0; j--){
            suffixProduct[j-1]= suffixProduct[j]*nums[j];
        }
        for(int i = 0; i< nums.length; i++){
            nums[i]=prefixProduct[i]*suffixProduct[i];
        }
        return nums;
    }
}
