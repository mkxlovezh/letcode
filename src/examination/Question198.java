package examination;

public class Question198 {
    public int rob(int[] nums) {
        int len=nums.length;
        int[] dp=new int[len];
        if(len==0){
            return 0;
        }
        dp[0]=nums[0];
        if(len==1){
            return dp[0];
        }

        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=0;i<len;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i-2;j>=0;j--){
                if(dp[j]+nums[i]>max){
                    max=dp[j]+nums[i];
                }
            }
            dp[i]=max;
        }
        return Math.max(dp[len-1],dp[len-2]);
    }
}
