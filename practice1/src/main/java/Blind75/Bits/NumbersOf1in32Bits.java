package Blind75.Bits;

public class NumbersOf1in32Bits {
    public static void main(String[] args) {
       hammingWeight(11);
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); // removes the lowest 1
            count++;
        }
        return count;
    }
}
