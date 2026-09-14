package Interviews_practicess_2026;

public class POWXN {
    public static void main(String[] args) {

    }



    /*
    2 pow 10   =   4 pow 5     16 pow 2   256


     */
    public int pow(int x,int n){


        int num=Math.abs(x);
        int res=0;
        while(num!=0){
            if(num%2==1){
                res=res*x;
                num=num-1;
            }
            num=num/2;
            x=x*x;
        }
        if(num<0){
            return 1/res;

        }else
        {
            return res;
        }



    }
}
