package Integers;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(123456543)); // 123  retur 321  if -123 -321
    }
    public static int reverse(int x) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        if (x == min || x == max) return 0;
        int rev = 0;
        while (x != 0) {
            int last = x % 10;
            if (rev > max / 10) return 0;  //positive check
            if (rev < min / 10) return 0;  //negtive check
            rev = rev * 10 + last;
            x = x / 10;
        }
        return rev;
    }
}
