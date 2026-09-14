package top20;

import java.util.Arrays;
import java.util.Random;

public class KrorateArray {

    public static void main(String[] arg) {

        Random r = new Random();
        Integer n = Integer.parseInt(arg[0]);
        Integer[] inputArray = new Integer[n];
        for (int i = 0; i < n; i++
        ) {
            inputArray[i] = r.nextInt(n) + 1;
        }
        int k = n - 1;
        System.out.println(Arrays.toString(inputArray));
        rotateArray(inputArray, k);
        System.out.println(Arrays.toString(inputArray));
    }

    //  TC:O(N)  SC :O(N)
     private static void rotateArray(Integer[] n, int k) {
        int[] aux=new int[n.length];
        for(int i=0;i<n.length;i++){
            aux[(k+i)%n.length]=n[i];
        }
        for(int i=0;i<aux.length;i++){
            n[i]=aux[i];
        }
    }

    /*WIthout extra Space      2 5 8 4 1 3 6  k=3  o/p
         Swap last to first      6 3 1 4 8 5 2
          rever first half and second      1 3 6  2 5 8 4

    */
    private static void rotateArray3(Integer[] n, int k) {
        reverseArray(n,0,n.length);
        reverseArray(n,0,k);
        reverseArray(n,k+1,n.length);
    }

    private static void reverseArray(Integer[] n,int l, int r) {
        while(l<r){
            int temp=n[l];
            n[l]=n[r-1];
            n[r-1]=temp;
            r=r-1;
            l=l+1;
        }
    }
}
