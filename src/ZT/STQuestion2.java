package ZT;

import java.util.Scanner;

public class STQuestion2 {
    public static int solution(int[] input,int N){
        int[] dp=new int[N];
        if(N<2){
            return 0;
        }
        dp[1]=0;

        for(int i=2;i<N;i++){
            if(input[i-1]<=input[i]){
                dp[i]=dp[i-1];
            }else {
                int j=i-1;
                boolean flag=true;
                for(;j>0;j--){
                    if(input[j]>input[j-1]){
                        break;
                    }
                    if(input[j]==input[j-1]){
                        flag=false;
                        break;
                    }
                }
                if(flag==false){
                    dp[i]=dp[j-1];
                    break;
                }
                for(;j>0;j--){
                    if(input[j]<input[j-1]){
                        break;
                    }
                }
                dp[i]=Math.max(dp[j],i-j+1);

            }
        }
        return dp[N-1];
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] input=new int[N];

        for(int i=0;i<N;i++){
            input[i]=scanner.nextInt();
        }

        System.out.println(solution(input,N));
    }
}
