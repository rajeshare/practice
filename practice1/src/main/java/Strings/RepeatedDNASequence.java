package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequence {
    public static void main(String[] args) {
        String str="";
        findRepeatedDnaSeq(str);
    }
    private static List<String> findRepeatedDnaSeq(String str) {
        Map<String,Integer> map=new HashMap<>();
        List<String> res=new ArrayList<>();
        for(int i=0;i<=str.length()-10;i++){
            String subString=str.substring(i,i+10);
          //  map.put(subString,map.getOrDefault(subString,0)+1);
            if(map.containsKey(subString)){
                map.put(subString,map.get(subString)+1);
                res.add(subString);
            }else {
                map.put(subString,1);
            }
        }
        return res;
    }
}
