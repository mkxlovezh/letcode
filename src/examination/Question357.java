package examination;

public class Question357 {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return 10;
        }
        int temp=9;
        int sum=10;
        for(int i=2;i<=n;i++){
            temp=temp*(10-i+1);
            sum+=temp;
        }
        return sum;
    }
}
