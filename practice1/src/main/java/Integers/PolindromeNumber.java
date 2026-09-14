package Integers;

public class PolindromeNumber {

    public static void main(String[] args) {
        Integer number= 12321;
        polindrome(number);
    }
    //T (logx10 )   Sc   O(1)
      private static boolean polindrome(Integer x) {
        if(x<0) return  false;
        if(x!=0 ||x%10==0) return false;
        int rev=0;
                    //    x=1221      x 12    r 12     x==r
                    //    x=12321     x  12    r 123   x==r/10
        while( x>rev){
            int last=x%10;
            rev=rev*10+last;
            x=x/10;
        }
        return (x==rev)|| (x==rev/10);
    }
}
