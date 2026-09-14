package Strings;

import java.util.ArrayList;
import java.util.List;

public class StringPermutataion {

    public static void main(String[] args) {
        String input="abc";
        List<String> list=new ArrayList<>();
        String perm="";
        dfs(input,perm,list);
        System.out.println(list.toString());
    }

    private static void dfs(String input, String perm, List<String> list) {
        if(input.length() == 0){
            list.add(perm);
            System.out.println("list "+perm);
        }
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            String tmp=input.substring(0, i)+input.substring(i+1);
            System.out.println("input "+input+" Ch  "+ch+" tmp "+tmp +" perm "+perm+ch);
            dfs(tmp, perm+ch, list);
        }
    }
}
