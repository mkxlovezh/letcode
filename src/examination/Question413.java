package examination;

public class Question413 {
    public int numberOfArithmeticSlices(int[] A) {
        int[] dp=new int[A.length];
        for(int i=2;i<A.length;i++){
            if(A[i]-A[i-1]==A[i-1]-A[i-2]){
                dp[i]=dp[i-1]+1;
            }else {
                dp[i]=0;
            }
        }
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=dp[i];
        }
        return sum;
    }
}
