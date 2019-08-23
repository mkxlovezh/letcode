package ZT;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WY1Question1 {
    public static void solution(int [] scores,int[] query,int n){
        double fn=n*1.000000d;
        DecimalFormat df=new DecimalFormat("###.000000");
        for(int i=0;i<query.length;i++){
            int count=0;
            for(int j=0;j<scores.length;j++){
                if(scores[j]<=scores[query[i]]){
                    count++;
                }
            }
            double result=((count-1)*100)/fn;
            if(result==0d){
                System.out.println("0.000000");
            }else {
                System.out.println(df.format(result));
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] scores=new int[n];
        for(int i=0;i<n;i++){
            scores[i]=scanner.nextInt();
        }
        int qu=scanner.nextInt();
        int[] query=new int[qu];
        for(int i=0;i<qu;i++){
            query[i]=scanner.nextInt()-1;
        }
        solution(scores,query,n);
    }
}
