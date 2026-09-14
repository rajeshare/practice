package Blind75.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramGroup {
    public static void main(String[] args) {
        AnagramGroup ag=new AnagramGroup();
       String[] str= {"eat","tea","tan","ate","nat","bat"};
        System.out.println(ag.anagramGroup(str));
    }

    private List<List<String>> anagramGroup(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        HashMap<String, List<String>> frequencyVsString = new HashMap<>();
        for (String s : strs) {
            String frequencyString = frequencyString(s);
            List<String> valueList = null;
            if (frequencyVsString.containsKey(frequencyString)) {
                valueList = frequencyVsString.get(frequencyString);
                valueList.add(s);
            } else {
                valueList = new ArrayList<>();
                valueList.add(s);
                frequencyVsString.put(frequencyString, valueList);
            }
        }
        return new ArrayList<>(frequencyVsString.values());
    }

    private String frequencyString(String s) {
        char[] ch=s.toLowerCase().toCharArray();
        char[] hashArray=new char[26];

        for(char c:ch){
           int index=c-'a';
           hashArray[index]++;
        }
        StringBuilder str=new StringBuilder();
        char c='a';
        for (int i:hashArray){
            str.append(c);
            str.append(i);
            c++;
        }
        return str.toString();
    }
}
