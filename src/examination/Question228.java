package examination;

import java.util.ArrayList;
import java.util.List;

public class Question228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<>();
        if(nums.length==0){
            return result;
        }
        int start=nums[0];
        int end=start;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                end=nums[i-1];
                if(end==start){
                    result.add(start+"");
                }else {
                    result.add(start+"->"+end);
                }
                start=nums[i];
                end=start;
            }
        }
        end=nums[nums.length-1];
        if(end==start){
            result.add(start+"");
        }else {
            result.add(start+"->"+end);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input={0,1,2,4,5,7};
        System.out.println(summaryRanges(input).toString());
    }
}
