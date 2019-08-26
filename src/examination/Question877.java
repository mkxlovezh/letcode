package examination;

public class Question877 {
    public boolean stoneGame(int[] piles) {
        int len=piles.length;
        int[][] dp=new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if((j-i)%2==1){
                    dp[i][j]=Math.max(dp[i+1][j]+piles[i],dp[i][j-1]+piles[j]);
                }else{
                    dp[i][j]=Math.min(dp[i+1][j]-piles[i],dp[i][j-1]+piles[j]);
                }
            }
        }
        if(dp[0][len-1]<0){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        Question877 question877=new Question877();
        int[] input={5,3,4,5};
        System.out.println(question877.stoneGame(input));
    }
}
