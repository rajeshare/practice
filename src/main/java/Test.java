interface Calc {
    int calculate(int a, int b);
}

public class Test {
    public static void main(String[] arg) {
        Calc add=(a,b)->a+b;
        Calc multiply=(a,b)->a*b;
        Calc minus=(a,b)->a-b;
       System.out.println(add.calculate(8,9) +" "+
        multiply.calculate(8,9)+" "+
        minus.calculate(8,9));
    }
}
