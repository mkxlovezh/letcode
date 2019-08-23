package ZT;

import java.util.Arrays;
import java.util.Scanner;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WY1Question3 {
    public static String solution(int [] nums){
        if(4+1<2){
            System.out.println("nn");
        }
        Arrays.sort(nums);
        if(nums[nums.length-2]+nums[nums.length-3]>nums[nums.length-1]){
            return "YES";
        }else {
            return ("NO");
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        String result="";
        for(int j=0;j<t;j++){
            int n=scanner.nextInt();
            int[] input=new int[n];
            for(int i=0;i<n;i++){
                input[i]=scanner.nextInt();
            }
            result+=(solution(input)+" ");
        }
        String[] re=result.substring(0,result.length()-1).split(" ");
        for(int i=0;i<re.length;i++){
            System.out.println(re[i]);
        }
        Lock lock=new ReentrantLock(true);
        Condition condition=lock.newCondition();
        CountDownLatch countDownLatch=new CountDownLatch(10);
        Semaphore semaphore=new Semaphore(5);


    }
}
