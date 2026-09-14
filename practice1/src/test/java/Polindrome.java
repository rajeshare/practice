public class Polindrome {

    public static void main(String[] args) {
       System.out.println(polindrome(121));
         System.out.println(polindrome1(1232321));
    }


    /*
    *  THIS OVERFLOWS FOR LARGE NUMBERS LIKE 123456789987654321
     */
    private static boolean polindrome(Integer num) {
        Integer rev = 0,temp = num;
        if(num <0 || (num %10 ==0 && num !=0)){
            return false;
        }
        while(num >0){
            Integer rem= num %10;
            rev = rev *10+rem;
            System.out.println(rem + " " + rev);
            num = num /10;
        }
        return (rev == temp)||temp == rev/10;

    }

    private static boolean polindrome1(Integer num) {
        if(num < 0){
            return false;
        }
        if(num%10 ==0 && num !=0){
            return false;
        }
        int rev = 0;
        while(num > rev){
            Integer rem = num %10;
            rev = rev *10 + rem;
            num = num /10;
        }
        return (rev == num)||num == rev/10;
    }
}
