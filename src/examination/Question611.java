package examination;

import java.util.Arrays;

public class Question611 {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        for (int i = n - 1; i >= 2; --i) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (nums[l] + nums[r] > nums[i]) {
                    res += r - l;
                    --r;
                } else {
                    ++l;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Question611 question611=new Question611();
        int[] input={2,2,3,4};
        question611.triangleNumber(input);
    }
}
