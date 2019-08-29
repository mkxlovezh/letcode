package examination;

public class Question486 {
    public boolean PredictTheWinner(int[] nums) {
        int len=nums.length;
        int[][] dp=new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if((len-(j-i+1))%2==0){
                    dp[i][j]=Math.min(dp[i+1][j]-nums[i],dp[i][j-1]-nums[j]);
                }else {
                    dp[i][j]=Math.max(dp[i+1][j]+nums[i],dp[i][j-1]+nums[j]);
                }
            }
        }
        if(dp[0][len-1]>0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Question486 question486=new Question486();
        int[] input={1, 5, 233, 7};
        System.out.println(question486.PredictTheWinner(input));
    }
}
