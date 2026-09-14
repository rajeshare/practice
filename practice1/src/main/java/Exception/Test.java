package Exception;

import java.util.SortedMap;

public class Test {

    public static void main(String[] args) throws Exception {
        Test t=new Test();
        try{
            System.out.println(t.decode());
        }catch (Exception e){
            System.out.println("error"+e);
        }
    }


    public String decode() throws Exception{
        try {
            int a=1/0;
        }catch (Exception e){
            System.out.println("Exception");
        }
        return "Output";
    }


}
