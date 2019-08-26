package examination;

public class Question343 {
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i-1;j>0;j--){
                if(max<(Math.max(j,dp[j]))*(Math.max((i-j),dp[i-j]))){
                    max=(Math.max(j,dp[j]))*(Math.max((i-j),dp[i-j]));
                }
            }
            dp[i]=max;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Question343 question343=new Question343();
        question343.integerBreak(2);
    }
}
