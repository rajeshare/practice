package Integers;

public class POW_X_N {
    public static void main(String[] args) {
        mypow(2,10);
    }

    public static double mypow(double x, int n) {
        long num = Math.abs((long) n);
        double res = 1.0;
        while (num != 0) {
            if (num % 2 == 1) {   //if n is odd number
                res = res * x;
                num = num - 1;
            }
            x = x * x;
            num = num / 2;
        }
        return n < 0 ? 1.0 / res : res;
    }
    /*
    2pow  5
    res = 2.0 4  x=4 n 2 -> x=16 n 1  -> res = 32  n=0 x 256 n=0

    N =11   r=1.0    x=2

            r=2.0  n=10 x=4 n=5
            r=2.0*4=8.0  n=4 x=16 n=2
            r=8.0      n=1 x=256
           n=1   r=8.0*256   n=0 x=256*256






         r 4  n=4    16 n2




        */
}

//TC : O(log2 n)  SC O(1)