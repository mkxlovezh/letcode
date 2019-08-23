package ZT;

import java.util.Arrays;
import java.util.Scanner;

public class WYQuestion3 {
    public static void solution(int[] apple,int[] ask ){
        int[] w=new int[apple.length+1];
        w[0]=0;
        for(int i=1;i<w.length;i++){
            w[i]=w[i-1]+apple[i-1];
        }

        for(int i=0;i<ask.length;i++){
            for(int j=1;j<w.length;j++){
                if(ask[i]>=w[j-1]+1&&ask[i]<=w[j]){
                    System.out.println(j);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int al=scanner.nextInt();
        int[] apple=new int[al];
        for(int i=0;i<al;i++){
            apple[i]=scanner.nextInt();
        }
        int asl=scanner.nextInt();
        int[] ask=new int[asl];
        for(int i=0;i<asl;i++){
            ask[i]=scanner.nextInt();
        }
        solution(apple,ask);

    }
}
