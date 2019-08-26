package examination;

public class Question983 {
    public int mincostTickets(int[] days, int[] costs) {
        int len=days.length;
        int[] dp=new int[366];
        int[] travel=new int[366];
        for(int i=0;i<days.length;i++){
            travel[days[i]]=1;
        }
        for(int i=1;i<366;i++){
            if(travel[i]!=1){
                dp[i]=dp[i-1];
            }else {
                int x1,x2,x3;
                if(i-1<=0){
                    x1=costs[0];
                }else {
                    x1=dp[i-1]+costs[0];
                }
                if(i-7<=0){
                    x2=costs[1];
                }else {
                    x2=dp[i-7]+costs[1];
                }
                if(i-30<=0){
                    x3=costs[2];
                }else {
                    x3=dp[i-30]+costs[2];
                }


                dp[i]=dp[i]=Math.min(Math.min(x1,x2),x3);
            }
        }
        return dp[days[len-1]];

    }
}
