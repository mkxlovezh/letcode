package examination;

import java.util.Arrays;

public class Question621 {
    public static int leastInterval(char[] tasks, int n) {
        int[] t=new int[26];
        for(int i=0;i<tasks.length;i++){
            t[tasks[i]-65]++;
        }
        int max=0;
        for(int i=0;i<26;i++){
            if(t[i]>max){
                max=t[i];
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(t[i]==max){
                count++;
            }
        }
        if((n+1)*(max-1)+count<tasks.length){
            return tasks.length;
        }else {
            return (n+1)*(max-1)+count;
        }



    }

    public static void main(String[] args) {
        char[] tasks={'A','A','A','B','B','B','C'};
        System.out.println(leastInterval(tasks,2));
    }
}
