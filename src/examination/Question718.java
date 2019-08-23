package examination;

public class Question718 {
    public static int findLength(int[] A, int[] B) {
        int lenA=A.length;
        int lenB=B.length;
        int[][] dp=new int[lenA][lenB];
        for(int i=0;i<B.length;i++){
            if(A[0]==B[i]){
                dp[0][i]=1;
            }
        }

        for(int i=0;i<A.length;i++){
            if(B[0]==A[i]){
                dp[i][0]=1;
            }

        }

        for(int i=1;i<lenA;i++){
            for(int j=1;j<lenB;j++){
                if(A[i]==B[j]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=0;
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<lenA;i++){
            for (int j=0;j<lenB;j++){
                if(dp[i][j]>max){
                    max=dp[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A={1,0,0,0,1};
        int[] B={1,0,0,1,1};
        findLength(A,B);
    }
}
