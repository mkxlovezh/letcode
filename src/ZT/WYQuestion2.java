package ZT;

import java.util.Scanner;

public class WYQuestion2 {
    public static void solution(int[] scores,int[] sleep,int k){
        int sum=0;
        for(int i=0;i<scores.length;i++){
            if(sleep[i]==1){
                sum+=scores[i];
            }
        }
        int max=sum;
        for(int i=0;i<scores.length;i++){
            if(sleep[i]==0){
                int add=0;
                for(int j=0;j<k;j++){
                    if(i+j<scores.length&&sleep[i+j]==0){
                        add+=scores[i+j];
                    }
                }
                if(sum+add>max){
                    max=sum+add;
                }
            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[] scores=new int[n];
        int[] sleep=new int[n];
        for(int i=0;i<n;i++){
            scores[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            sleep[i]=scanner.nextInt();
        }
        solution(scores,sleep,k);
    }
}
