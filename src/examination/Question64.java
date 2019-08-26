package examination;

public class Question64 {
    public int minPathSum(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[][] dp=new int[row][col];
        int sumRow=0;
        for(int i=0;i<row;i++){
            sumRow+=grid[i][0];
            dp[i][0]=sumRow;
        }
        int sumCol=0;
        for(int j=0;j<col;j++){
            sumCol+=grid[0][j];
            dp[0][j]=sumCol;
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[row-1][col-1];
    }
}
