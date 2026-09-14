package Interviews_practicess_2026;

public class Polindrome {
    public boolean isPalindrome(int x) {

        if(x<0) return false;
        if(x==0 && x/10 == 0) return false;

        int rev=0;
        while(x>rev){
            int last= x%10;
            x=x/10;
            rev=rev*10+last;
        }
        return x==rev||x==rev/10;

    }

    public static void main(String[] args) {
        Polindrome p=new Polindrome();
        System.out.println(p.isPalindrome(1235321));
    }
}
