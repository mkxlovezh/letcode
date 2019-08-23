package examination;

public class Question769 {
    public static int maxChunksToSorted(int[] arr) {
        //哪些在最终位置，就是哪些点要切割

        int res = 0, max = 0;
        for (int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);//统计前i个位置的最大元素
            if (max == i) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] input={1,4,0,2,3,5};
        maxChunksToSorted(input);
    }
}
