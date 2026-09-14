package dynamicProgram;

public class ClimbindStairs {


    public static void main(String[] args) {
        System.out.println("" + climbinstair(5));
        System.out.println("" + climbinstairFIBbuttomUp(5));
    }

   /* TC=O(N)  SC=O(N)
    */
    private static int climbinstair(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++
        ) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    /* TC=O(N)  SC=O(1)
     */
    private static int climbinstairFIBbuttomUp(int n) {
        if (n <= 2) return n;
        int first=1,sec=2;
        for(int i=2;i<n;i++){
            int tmp=first+sec;
            first=sec;
            sec=tmp;
        }
        return  sec;
    }


}
