package Interviews_practicess_2026;

public class Reverse32Bit {
    public static void main(String[] args) {
        Reverse32Bit obj=new Reverse32Bit();
        System.out.println(obj.reverse(12321));
    }

    public int reverse(int x) {

        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;

        int rev=0;
        while(x!=0){
            int last=x%10;
            if(rev>max/10||rev<min/10){
                return 0;
            }
            rev=rev*10+last;
            x=x/10;
        }
        return rev;
    }
}
