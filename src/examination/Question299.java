package examination;

import java.util.ArrayList;
import java.util.List;

public class Question299 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int candidate=nums[0];
        int count=2;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(nums[i]!=candidate){
                count--;
            }
            if(nums[i]==candidate){
                count=count+2;
            }

        }
        int another=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=candidate){
                another=nums[i];
                break;
            }
        }
        if(count>0){
            list.add(candidate);
            if(another==candidate){
                return list;
            }else {
                int c=2;
                for(int i=1;i<nums.length;i++){
                    if(nums[i]!=candidate){
                        if(c==0){
                            another=nums[i];
                        }
                        if(nums[i]!=another){
                            c--;
                        }
                        if(nums[i]==another){
                            c=c+2;
                        }
                    }
                }
                if(c>0){
                    list.add(another);
                }
            }

            return list;
        }else {
            return list;
        }


    }

    public static void main(String[] args) {
        int[] input={3,2,3};
        System.out.println(majorityElement(input).toString());
    }

}
