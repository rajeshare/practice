package Interviews_practicess_2026;

public class ReverseWordsinString {

    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        char[] chars=s.toCharArray();
        int n=s.length();
        //Reverse Entire String
        // Hellow World -> dlroW wolleH
        reverse(chars,0,n-1);
        // Reverse Single String world
        reverseWord(chars);
        //clean the spaces
        cleanSpace(chars);
        return String.valueOf(chars);
    }

    private void cleanSpace(char[] chars) {


    }

    public void reverse(char[] ch,int l,int r) {
       int i=l;
        for(int j=r;j>=i;j--){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
        }
    }

    public void reverseWord(char[] ch){
        int left=0,right=0;
       while(left<ch.length){
           //Increase left untile find  char
           while(left<ch.length && ch[left]==' '){
               left++;
           }
           //Increase right until find char
           while(right<ch.length && ch[right]!=' '){
               right++;
           }
           reverse(ch,left,right-1);
           left=right;
       }
    }
}
