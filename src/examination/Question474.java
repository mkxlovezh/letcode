package examination;

public class Question474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp=new int[m+1][n+1][strs.length+1];
        int[] count_0=new int[strs.length];
        int[] count_1=new int[strs.length];
        for(int i=0;i<strs.length;i++){
            char[] strss=strs[i].toCharArray();
            for(int j:strss){
                if(j=='0'){
                    count_0[i]++;
                }
                if(j=='1'){
                    count_1[i]++;
                }
            }
        }
        for(int z=1;z<=strs.length;z++){
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    if(count_0[z-1]<=i&&(count_1[z-1])<=j){
                        dp[i][j][z]=Math.max(dp[i-count_0[z-1]][j-count_1[z-1]][z-1]+1,dp[i][j][z-1]);
                    }else{
                        dp[i][j][z]=dp[i][j][z-1];
                    }
                }
            }
        }
        return dp[m][n][strs.length];
    }

    public static void main(String[] args) {
        Question474 question474=new Question474();

        String[] inputs={"10","0","1"};
        System.out.println(question474.findMaxForm(inputs,1,1));
    }
}
