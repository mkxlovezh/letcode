package examination;

import java.util.Arrays;

public class Question1031 {
    public static int maxSumTwoNoOverlap(int[] A, int L, int M) {
        int len=A.length;
        int[] AL=new int[len-L+1];
        int[] AM=new int[len-M+1];
        int sumL=0;
        int sumM=0;
        for(int i=0;i<L;i++){
            sumL+=A[i];
        }
        AL[0]=sumL;
        for(int i=1;i<AL.length;i++){
            AL[i]=AL[i-1]-A[i-1]+A[i+L-1];
        }
        for(int i=0;i<M;i++){
            sumM+=A[i];
        }
        AM[0]=sumM;
        for(int i=1;i<AM.length;i++){
            AM[i]=AM[i-1]-A[i-1]+A[i+M-1];
        }
        int max=0;

        System.out.println(Arrays.toString(AL));
        System.out.println(Arrays.toString(AM));
        for(int i=0;i<AL.length;i++){
            for(int j=0;j<AM.length;j++){
                int a1=i;
                int a2=j;
                int b1=i+L-1;
                int b2=j+M-1;
                if(a1>b2||a2>b1){
                    if(AL[i]+AM[j]>max){
                        max=AL[i]+AM[j];
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] input={2,1,5,6,0,9,5,0,3,8};
        maxSumTwoNoOverlap(input,4,3);
    }
}
