package examination;

import java.util.Arrays;

public class Question300 {
    public int lengthOfLIS(int[] nums) {
        int len=nums.length;
        if(len==0){
            return 0;
        }
        int[] dp=new int[len];
        Arrays.fill(dp,1);
        for(int i=1;i<len;i++){
            int m=1;
            for(int j=i-1;j>=0;j--){

                if(nums[i]>nums[j]&&m<dp[j]+1){
                    m=dp[j]+1;
                }
            }
            dp[i]=m;

        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(dp[i]>max){
                max=dp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Question300 question300=new Question300();
        int[] input={10,9,2,5,3,7,101,18};
        System.out.println(question300.lengthOfLIS(input));
    }
}
