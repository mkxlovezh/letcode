package examination;

import java.util.ArrayList;
import java.util.List;

public class Question1025 {
    public boolean divisorGame(int N) {
        boolean dp[]=new boolean[N+1];
        if(N<2){
            return false;
        }
        dp[0]=false;
        dp[1]=false;
        for(int i=2;i<=N;i++){
            for(int j=1;j<i;j++){
                if(i%j==0&&dp[i-j]==false){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[N];
    }
}
