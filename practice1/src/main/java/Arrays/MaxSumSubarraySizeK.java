package Arrays;

//
//1. Maximum Sum of Subarray of Size K
//Input:
//N = 4, K = 2
//Arr = [100, 200, 300, 400]
//Output:
//700
// Space O(1)  Time O(n)
public class MaxSumSubarraySizeK {

    private static int maxSum(int[] arr, int k) {
        int maxSum=0, windowSum=0;
        for(int i=0;i<k;i++) {
            windowSum+=arr[i];
        }
        maxSum=windowSum;
        for(int i=k;i<arr.length;i++) {
            windowSum+=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,windowSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr= {1,4,2,10,23,3,1,0,20};
        int k=4;
        System.out.println(maxSum(arr,k));
        // k=3
        // [1,4,2] = 7
        // [4,2,10] = 16
    }
}

