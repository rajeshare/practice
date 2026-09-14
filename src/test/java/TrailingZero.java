public class TrailingZero {

    public  static void main(String[] args) {

        int num=125;
        System.out.println(trailingZero(num));

    }


    /*

    5 =    1
    20 = 5 10 15 20 = 4
    25 = 5 10 15 20 25 = 5+1=6
    50 = 5 10 15 20 25 30 35 40 45 50 = 10+2=12
    125 = 5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100 105 110 115 120 =125/5+125/25+125/125=25+5+1=31

     */

    private static int trailingZero(int num) {
        int count =0;

        while (num!=5){
            count = count+num/5;
            num*=5;
        }
        return  count;

    }





}
