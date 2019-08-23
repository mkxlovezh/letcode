package examination;

public class Question1035 {
    public int maxUncrossedLines(int[] A, int[] B) {
        int[][] dp=new int[A.length][B.length];
        int flag=0;
        for(int i=0;i<B.length;i++){
            if(A[0]==B[i]){
                flag=1;
            }
            dp[0][i]=flag;
        }
        flag=0;
        for(int i=0;i<A.length;i++){
            if(B[0]==A[i]){
                flag=1;
            }
            dp[i][0]=flag;
        }
        for(int i=1;i<A.length;i++){
            for(int j=1;j<B.length;j++){
                if(A[i]==B[j]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[A.length-1][B.length-1];
    }
}
