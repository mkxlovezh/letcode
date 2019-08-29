package examination;

public class Question813 {
    public static double largestSumOfAverages(int[] A, int K) {
        double[][] dp=new double[A.length+1][K+1];

        int[] sum=new int[A.length+1];
        for(int i=1;i<=A.length;i++){
            sum[i]=sum[i-1]+A[i-1];
        }
        for(int i=1;i<=A.length;i++){
            dp[i][1] = 1.0 * sum[i] / i;
            for(int k=2;k<=K&&k<=i;k++){
                for(int j=1;j<i;j++){
                    dp[i][k]=Math.max(dp[i][k],dp[j][k-1]+1.0*(sum[i]-sum[j])/(i-j));
                }
                System.out.println(i+" "+k+" "+dp[i][k]);

            }

        }
        return dp[A.length][K];
    }

    public static void main(String[] args) {
        int[] input={9,1,2,3,9};
        System.out.println(largestSumOfAverages(input,3));
    }
}
