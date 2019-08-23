package ZT;

import java.util.Arrays;
import java.util.Scanner;

public class WYQuestion1 {
    public static void solution(int n,int[] input){
        int[] in=new int[n+1];
        for(int i=0;i<input.length;i++){
            in[input[i]]++;
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            if(in[i]<min){
                min=in[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lie=scanner.nextInt();
        int step=scanner.nextInt();
        int[] input=new int[step];
        for(int i=0;i<step;i++){
            input[i]=scanner.nextInt();
        }
        solution(lie,input);
    }
}
