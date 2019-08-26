package examination;

import java.util.*;

public class Question646 {
    public int findLongestChain(int[][] pairs) {
        int n=pairs.length;

        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int res = 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (pairs[i][0] > pairs[j][1]) {
                    dp[i] = dp[j] + 1;
                    break;
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;

    }

    public static void main(String[] args) {
        Question646 question646=new Question646();
        int[][] input={{9,10},{9,10},{4,5},{-9,-3},{-9,1},{0,3},{6,10},{-5,-4},{-7,-6}};
        System.out.println(question646.findLongestChain(input));
    }
}
