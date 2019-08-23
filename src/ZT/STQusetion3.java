package ZT;

import java.util.Scanner;

public class STQusetion3 {
    public static long f(long i,int a,int b,int c,int f0){
        if(i==0){
            return f0;
        }
        if(i<0){
            return 0;
        }

        return  (a*f(i-1,a,b,c,f0)+b*f(i-2,a,b,c,f0)+c*f(i-3,a,b,c,f0)+2*i*i-i+32767)%1000000007;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] input=new int[5];
        Long n=scanner.nextLong();
        for(int i=0;i<4;i++){
            input[i]=scanner.nextInt();
        }

        System.out.println(f(n,input[0],input[1],input[2],input[3]));
    }
}
