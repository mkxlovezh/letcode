package examination;

public class Question416 {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2==1){
            return false;
        }else {
            int total=sum/2;
            boolean[][] dp=new boolean[nums.length+1][total+1];
            for(int i=1;i<=nums.length;i++){
                dp[i][0]=true;
            }
            for(int i=1;i<=nums.length;i++){
                for(int k=1;k<=total;k++){
                    if(k>=nums[i-1]){
                        dp[i][k]=dp[i-1][k]||dp[i-1][k-nums[i-1]];
                    }
                }
            }
            return dp[nums.length+1][total];
        }

    }
}
