package ZT;

import java.util.Arrays;
import java.util.Scanner;

public class DiDiTest1 {
    public static void solution(String[] input,int N){
        for(int i=0;i<N;i++){
            for(int j=2;j<2*N-2;j=j+2){
                boolean a=input[j+1].equals("+")||input[j+1].equals("*");
                boolean b=Integer.valueOf(input[j+2])<Integer.valueOf(input[j]);
                if(((input[j+1].equals("+")&&input[j-1].equals("+"))||(input[j-1].equals("*")))&&(Integer.valueOf(input[j])<Integer.valueOf(input[j-2]))){
                    String temp=input[j-2];
                    input[j-2]=input[j];
                    input[j]=temp;
                }
            }
        }
        String re="";
        for(int i=0;i<input.length;i++){
            re+=(input[i]+" ");
        }
        System.out.println(re);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        String[] in=new String[2*N-1];
        for(int i=0;i<2*N-1;i++){
            in[i]=scanner.next();
        }
//        String input=scanner.nextLine();
//        System.out.println(input);
//        String[] inputs=input.split(" ");
        solution(in,N);
    }
}
