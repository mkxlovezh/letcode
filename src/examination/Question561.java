package examination;

import java.util.Arrays;

public class Question561 {
    public int arrayPairSum(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=Math.min(nums[2*i],nums[2*i+1]);
        }
        return sum;
    }
}
