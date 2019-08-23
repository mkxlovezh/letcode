package ZT;

public class WY2Question2 {
    public static void solution(int[] input){
        int len=input.length;
        int[] sorted=new int[len];
        int[] flag=new int[len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(flag[j]==0&&sorted[i]+input[j]%2!=0){
                    flag[j]=1;

                }
            }
        }
    }


    public static void main(String[] args) {

    }
}
