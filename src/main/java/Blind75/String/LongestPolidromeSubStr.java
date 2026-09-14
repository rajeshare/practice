package Blind75.String;

public class LongestPolidromeSubStr {

    public static void main(String[] args) {
        LongestPolidromeSubStr lip=new LongestPolidromeSubStr();
       String LPS= lip.longestPolidromSubSring("MDABABADK");
       System.out.println(LPS);
    }

    private String longestPolidromSubSring(String str) {
        if(str.length()<=1){
            return str;
        }
        String lps="";
        for(int i=1;i<str.length();i++){
            int low=i;
            int high=i;
            while(str.charAt(low)==str.charAt(high)){
                low--;
                high++;
                if(low==-1||high==str.length()){
                    break;
                }
            }
            String polidrome=str.substring(low+1,high);
            if(polidrome.length()>lps.length()){
                lps=polidrome;
            }
             low =i-1;
             high=i;
            while(str.charAt(low)==str.charAt(high)){
                low--;
                high++;
                if(low==-1||high==str.length()){
                    break;
                }
            }
             polidrome=str.substring(low+1,high);
            if(polidrome.length()>lps.length()){
                lps=polidrome;
            }
        }
        return lps;
    }

}
