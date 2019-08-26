package examination;

public class Question931 {
    public int minFallingPathSum(int[][] A) {
        int[][] dp=new int[A.length][A.length];
        if(A.length==1){
            return A[0][0];
        }
        for(int i=0;i<A.length;i++){
            dp[0][i]=A[0][i];
        }
        for(int row=1;row<A.length;row++){
            for(int col=0;col<A.length;col++){
                if(col==0){
                    dp[row][col]=Math.min(dp[row-1][0],dp[row-1][1])+A[row][col];
                }else if(col==A.length-1){
                    dp[row][col]=Math.min(dp[row-1][A.length-1],dp[row-1][A.length-2])+A[row][col];
                }else {
                    dp[row][col]=Math.min(Math.min(dp[row-1][col-1],dp[row-1][col]),dp[row-1][col+1])+A[row][col];
                }
            }
        }
        int min=dp[A.length-1][0];
        for(int i=0;i<A.length;i++){
            if(dp[A.length-1][i]<min){
                min=dp[A.length-1][i];
            }
        }
        return min;
    }
}
