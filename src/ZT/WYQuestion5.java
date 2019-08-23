package ZT;

import java.util.Scanner;

public class WYQuestion5 {
    public static void solution(int a,int b,int c){
        System.out.println(Math.max(a+b+c,Math.max(a*b*c,Math.max(a+b*c,Math.max((a+b)*c,Math.max(a*b+c,a*(b+c)))))));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        solution(a,b,c);
    }
}
