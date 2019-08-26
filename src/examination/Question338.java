package examination;

public class Question338 {
    public int[] countBits(int num) {
        int[] dp=new int[num+1];
        dp[0]=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                dp[i]=dp[i/2];
            }else {
                dp[i]=dp[i-1]+1;
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        Question338 question338=new Question338();
        question338.countBits(0);
    }
}
