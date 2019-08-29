package examination;

public class Question650 {
    public static int minSteps(int n) {
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    if(dp[j]+(i-j)/j<min){
                        min=dp[j]+(i-j)/j;
                    }
                }
            }
            dp[i]=min;
        }
        return dp[n];

    }

    public static void main(String[] args) {
        minSteps(3);
    }
}
