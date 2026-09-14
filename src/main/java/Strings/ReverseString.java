package Strings;

public class ReverseString {
    public static void main(String[] args) {
   reverseString("rajesh");
    }

    private static void reverseString(String input) {
        char[] ch=input.toCharArray();
        int left=0,right=ch.length-1;
        while(left<right){
            char tmp=ch[left];
            ch[left]=ch[right];
            ch[right]=tmp;
            left++;
            right--;
        }
        System.out.println(ch);
    }

}
