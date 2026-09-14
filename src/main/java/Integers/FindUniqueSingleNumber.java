package Integers;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueSingleNumber {
    public static void main(String[] args) {
        int[] num={1,2,2,3,3,1,4};
        int res=  single1(num);
        int res2=  single2(num);
        System.out.println(res  + " "  +res2 );
    }
    //TC O(n)  SC O(n)
    private static int single1(int[] num) {
        if (num.length == 1) return num[0];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            if (set.contains(num[i])) {
                set.remove(num[i]);
            } else {
                set.add(num[i]);
            }
        }
        return set.iterator().next();
    }
    //T   O(n)   S  O(1)
    private static int single2(int[] num) {
        int res=0;
        for(int i=0;i<num.length;i++){
            res=res ^ num[i];
        }
        return res;
    }
}
