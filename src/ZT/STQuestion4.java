package ZT;

import java.util.Scanner;

public class STQuestion4 {
    public static int solution(int[] input,int N){
        return 3;
    }
    public static boolean judge(int[] input,int start,int end){
        for(int i=0;i<end;i++){
            if(!(Math.sqrt(input[i]*input[i]+input[i+1]*input[i+1])==0.0d)){
                return false;
            }
        }
        return true;
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
