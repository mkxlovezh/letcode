package ZT;

import java.util.Scanner;

public class WY1Question4 {
    public static void solution(int [] nums,int[] query){

        for(int i=0;i<query.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=query[i]){
                    nums[j]--;
                    count++;
                }
            }

            System.out.println(count);


        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int q=scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }

        int[] query=new int[q];
        for(int i=0;i<q;i++){
            query[i]=scanner.nextInt();
        }
        solution(nums,query);
    }
}
