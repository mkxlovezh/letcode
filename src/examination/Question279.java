package examination;

public class Question279 {
    public int numSquares(int n) {
        int len=(int)Math.sqrt(n);
        int[] score=new int[len];
        for(int i=0;i<len;i++){
            score[i]=(i+1)*(i+1);
        }
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[0]=0;
        for(int i=2;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<score.length;j++){
                if(i-score[j]>=0&&min>dp[i-score[j]]+1){
                    min=dp[i-score[j]]+1;
                }
            }
            dp[i]=min;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Question279 question279=new Question279();
        question279.numSquares(12);
    }
}
