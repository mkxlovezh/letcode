package ZT;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class WYQuestion6 {
    public static void solution(int[] input,int k){
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        int[][] result=new int[k+1][2];
        int count=0;
        for(int i=1;i<=k;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int maxindex=-1;
            int minindex=-1;
            for(int j=0;j<input.length;j++){
                if(input[j]<min){
                    min=input[j];
                    minindex=j;
                }
                if(input[j]>max){
                    max=input[j];
                    maxindex=j;
                }

            }
            if(max-min==0){
                break;
            }
            input[minindex]++;
            input[maxindex]--;
            result[i][0]=maxindex+1;
            result[i][1]=minindex+1;
            count++;
        }
        for(int j=0;j<input.length;j++){
            if(input[j]<mn){
                mn=input[j];
            }
            if(input[j]>mx){
                mx=input[j];

            }

        }
        System.out.println(mx-mn+" "+count);
        for(int i=1;i<=k;i++){
            System.out.println(result[i][0]+" "+result[i][1]);
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]=scanner.nextInt();
        }

        solution(input,k);
    }
}
