package examination;

public class Question764 {
    public static int orderOfLargestPlusSign(int N, int[][] mines) {
        int[][] dp=new int[N][N];
        int[][] nums=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                nums[i][j]=1;
            }
        }
        for(int i=0;i<mines.length;i++){
            nums[mines[i][0]][mines[i][1]]=0;
        }
        for(int i=0;i<N;i++){
            if(nums[0][i]==1){
                dp[0][i]=1;
            }else{
                dp[0][i]=0;
            }
        }
        for(int i=0;i<N;i++){
            if(nums[i][0]==1){
                dp[i][0]=1;
            }else{
                dp[i][0]=0;
            }
        }
        for(int i=1;i<N;i++){
            for(int j=1;j<N;j++){
                if(nums[i][j]==0){
                    dp[i][j]=0;
                }else {
                    if(dp[i][j-1]==0||dp[i-1][j]==0){
                        dp[i][j]=1;
                    }else {
                        int x=0;
                        for(int m=j;m<N&&m<j+dp[i][j-1]+1;m++){
                            if(nums[i][m]==1){
                                x++;
                            }else {
                                break;
                            }
                        }
                        int y=0;
                        for(int m=i;m<N&&m<i+dp[i-1][j]+1;m++){
                            if(nums[m][j]==1){
                                y++;
                            }else {
                                break;
                            }
                        }
                        dp[i][j]=Math.min(x,y);
                    }

                }

            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(dp[i][j]>max){
                    max=dp[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] input={{4,2}};
        System.out.println(orderOfLargestPlusSign(5,input));
    }
}
