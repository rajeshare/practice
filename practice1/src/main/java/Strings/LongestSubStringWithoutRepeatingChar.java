package Strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
       // String input="pwwkew";  //O/p  3   wke          HashMap {p = 0, w =2 k=3 e=4}
        String input="abba";
        int res=longestSubstringWithoutRepeatingChar(input);
    }
    //Using HashMap
    private static int longestSubstringWithoutRepeatingChar(String s) {

        int ans=0;

        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(!map.containsKey(ch)){
                map.put(ch,right);
            }else {
                left= Math.max(left,map.get(ch)+1);
                map.put(ch,right);
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
