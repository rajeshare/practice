package Blind75.String;

public class CountPolindrimeSubString {
    public static void main(String[] args) {
        CountPolindrimeSubString cps=new CountPolindrimeSubString();
        System.out.println(cps.countPSS("MDABABADK"));
    }
    public int countPSS(String str){
        if(str.length()<=1){
            return  1;
        }
        int count=0;
       for(int i=0;i<str.length();i++){
           //ODD lenth Poldnrome
           count+=countPolindromeSubString(str,i,i);
           //EVEN lenth Poldnrome
           count+=countPolindromeSubString(str,i,i+1);
       }
       return count;
    }

    private static int countPolindromeSubString(String str, int left, int right) {
        int count = 0;
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
            count++;
        }
        return count;
    }
}
