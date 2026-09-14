package sort;

import java.util.Arrays;


public class MergeSort {

    public static void main(String[] args) {
        int[] nums={10,9,8,7,6,5,4,3,2,1};
        int[] res=sortArray(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] sortArray(int[] nums) {
        int left = 0, right = nums.length - 1;
        mergesort(nums, left, right);
        return nums;
    }

    private static void mergesort(int[] nums,int left,int right) {
        if(left<right){
            int mid=left+(right-left)/2;
            mergesort(nums,left,mid);
            mergesort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }

    public static void merge(int[] nums, int left, int mid, int right) { // O(n)
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] A = new int[n1];
        int[] B = new int[n2];
        for (int i = 0; i < n1; i++) {
            A[i] = nums[left + i];
        }
        for (int i = 0; i < n2; i++) {
            B[i] = nums[mid + 1 + i];
        }
        // merge two sorted arrays
        // left->mid > A  mid+1->right > B,, nums[left -> right]
        // merge two sorted arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (A[i] <= B[j]) {
                nums[k++] = A[i++];
            } else {
                nums[k++] = B[j++];
            }
        }
        // [1,2,3] , [5,6,7] |  , [5,6,7]  [1,2,3]
        while (i < n1) nums[k++] = A[i++];
        while (j < n2) nums[k++] = B[j++];
    }

















}
