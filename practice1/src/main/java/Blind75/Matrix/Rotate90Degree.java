package Blind75.Matrix;

import java.util.Arrays;

public class Rotate90Degree {

    public static void main(String[] args) {
        int[][] m={{1,2,3},{4,5,6},{7,8,9}};
        for (int[] n:m
        ) {
            System.out.println(Arrays.toString(n));
        }
        rotate(m);
        for (int[] n:m
             ) {
            System.out.println(Arrays.toString(n));
        }

        }

    public static void rotate(int[][] m) {
        for(int i=0;i<m.length;i++){
            for(int j=i+1;j<m.length;j++){
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        for(int i=0;i<m.length;i++){
            int left =0,right=m.length-1;
            reverse(m[i],left,right);
        }
        //reverse each row
    }
    public static void reverse(int[] m,int l,int r){
        while (l < r) {
            int tmp=m[l];
            m[l]=m[r];
            m[r]=tmp;
            l++;
            r--;
        }
    }
}