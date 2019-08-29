package examination;

public class Question922 {
    public int[] sortArrayByParityII(int[] A) {
        int[] result=new int[A.length];
        for(int i=0,j=1,k=0;k<A.length;k++){
            if(A[k]%2==0){
                result[i]=A[k];
                i+=2;
            }else {
                result[j]=A[k];
                j+=2;
            }
        }
        return result;
    }
}
