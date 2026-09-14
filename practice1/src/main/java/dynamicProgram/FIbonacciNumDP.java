package dynamicProgram;

public class FIbonacciNumDP {
    public static void main(String[] args) {


        System.out.println(""+fib(5));


    }


    public static int fib(int n){

        if(n<=1) return  n;
        int first=0;
        int sec=1;

        for(int i=2;i<=n;i++){
            int tmp=first+sec;
            first=sec;
            sec=tmp;
        }
        return  sec;


    }



}
