package examination;

import java.util.Arrays;

public class Question667 {
    public static int[] constructArray(int n, int k) {
        int[] result=new int[n];
        result[0]=1;
        int j=1;
        int[] flag=new int[n+1];
        flag[1]=1;
        for(int i=k;i>1;i--){
            if(result[j-1]-i>0&&flag[result[j-1]-i]!=1){
                result[j]=result[j-1]-i;
                flag[result[j]]=1;
            }else {
                result[j]=result[j-1]+i;
                flag[result[j]]=1;
            }
            j++;

        }
        for(int i=1;i<n+1;i++){
            if(flag[i]!=1){
                result[j]=i;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructArray(6,5)));
    }

}
