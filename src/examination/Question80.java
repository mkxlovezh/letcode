package examination;

import java.util.Arrays;

public class Question80 {
    public static int removeDuplicates(int[] nums) {
        int k=0;
        int count=1;
        for(int i=1;i<nums.length;i++){

            if(nums[i]!=nums[i-1]){
                count=1;
            }else{
                count++;
            }
            if(count>2){
                k++;
            }
            nums[i-k]=nums[i];
        }
        return nums.length-k;
    }

    public static void main(String[] args) {
        int[] input={0,0,0,1,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(input));
        System.out.println(Arrays.toString(input));
    }
}
