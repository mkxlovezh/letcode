package examination;

public class Question53 {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        int[] dp=new int[len];
        dp[0]=nums[0];
        for(int i=1;i<len;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(dp[i]>max){
                max=dp[i];
            }
        }
        return max;
    }
}
