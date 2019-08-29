package examination;

import java.util.Arrays;
import java.util.Comparator;

public class Question1105 {
    public int minHeightShelves(int[][] books, int shelf_width) {
        int len=books.length;
        int[] dp=new int[len+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=len;i++){
            int sumlen=0;
            int maxh=0;
            for(int j=i-1;j>=0;j--){
                maxh=Math.max(maxh,books[j][1]);
                sumlen+=books[j][0];
                if(sumlen>shelf_width){
                    break;
                }
                dp[i]=Math.min(dp[j]+maxh,dp[i]);
            }
        }
        return dp[len];
    }

    public static void main(String[] args) {
        Question1105 question1105=new Question1105();
        int[][] input={{1,1},{2,3},{2,3},{1,1},{1,1},{1,1},{1,2}};
        System.out.println(question1105.minHeightShelves(input,4));
    }
}
