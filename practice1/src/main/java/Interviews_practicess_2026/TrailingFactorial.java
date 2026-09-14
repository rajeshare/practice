package Interviews_practicess_2026;

public class TrailingFactorial {

    /*
    5!= 120   1
    10!= 2
    15!= 3
    20!= 4
    25!= 5 + 1  =6
    50! = 12
    125!= 5,10,15---25--50--75--100--125 = 125/5+ 125/25+ 125/125
     */
    public int trailingFactorial(int n){

        int count=0;
        int poweroffive=5;
        while(n>=poweroffive){
            count+=n/poweroffive;
            poweroffive=poweroffive*5;
        }
            return count;
    }


    public static void main(String[] args) {
        TrailingFactorial t=new TrailingFactorial();
        System.out.println(t.trailingFactorial(125));
    }

}
