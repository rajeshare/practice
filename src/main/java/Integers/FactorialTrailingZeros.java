package Integers;
/*
    i/p n=3                                                                  i/p n=5
    3! = 1* 2 * 3 = 6  = 1                                                          5!=1 2 3 4 5= 120  = 1
       i/p n = 0  -> 1
    5!=   1----5    =120 = 1
   20!   =  ----5---10---15----20   =   4 trailing zeros
                10  10   10    10
   25!   =   ----5---10---15---20---25   =  5 trailin zeros  25 =5 pow 2  so answe 5+1 6
                10   10   10   10   10
   20!   =       5   10   15   20      20/5
   25    =        5 10 15 20 25  1->25
                   5 5  5  5  5*5     6
 trick
   50!   5,10,15,20,25,30,35,40,45,50     (12)   50/5 = 10  50/25 =2
   125!   125/5 = 25     125/25  = 5     125/125 = 1  total 31
   n/5    n/5square   n/5cube    n/5pow i
 */

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        System.out.println(trailinZeros(625));
    }
    public static int trailinZeros(int n) {
        int count = 0;
        int currPowerOfFile = 5;
        while (n >= currPowerOfFile) {
            count += (n / currPowerOfFile);
            currPowerOfFile *= 5;
        }
        return count;
    }
}
