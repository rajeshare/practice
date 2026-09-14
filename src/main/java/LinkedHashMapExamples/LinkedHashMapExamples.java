package LinkedHashMapExamples;

import java.util.LinkedHashMap;

public class LinkedHashMapExamples {
    public static void main(String[] args) {

        LinkedHashMap<String,String> lm=new LinkedHashMap<>(10,0.75f,true);

        lm.put("1","A");
        lm.put("2","B");
        lm.put("3","C");
        lm.put("4","D");
        lm.put("5","F");
        lm.put("1","E");
        lm.put("6","G");
        lm.get("5");
        lm.get("2");
        lm.put("7","H");
        lm.entrySet().stream().forEach(x->System.out.println(x));
    }
}
