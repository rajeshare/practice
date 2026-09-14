public class PrefixSum {
    public static void main(String[] args) {
        int[][] k={{1,3},{2,4}};
        int[] res=new int[k.length];
        int sum=0;


        //TC= O(N*M)
    /*    for(int n=0;n<k.length;n++){
            int i=k[n][0];          //  i=1   i=2   i=0
            int j=k[n][1];              // j=3  j=4   j=3
            sum=0;
            for(int m=i;m<=j;m++){
                sum=sum+num[m];
            }
            res[n]=sum;
        }
      */
        int[] num={1,2,3,4,5,6};
        //Prefix Sum
        int[] preSum=new int[num.length];
        sum=0;
        for (int i=0;i<num.length;i++) {
            sum=sum+num[i];
            preSum[i]=sum;
        }

        for(int n=0;n< k.length;n++){
            int i=k[n][0];          //  i=1   i=2   i=0
            int j=k[n][1];
            res[n]= preSum[j]- preSum[i-1];
        }


        //O(N)


        System.out.println(res);
    }
}

