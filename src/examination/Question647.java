package examination;

public class Question647 {
    public static int countSubstrings(String s) {
        boolean[][] dp=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            dp[i][i]=true;
        }
        System.out.println(s.length());
        for(int j=0;j<s.length();j++){
            for(int i=0;i<=j;i++){
                dp[i][j]=(s.charAt(i)==s.charAt(j)&&((j-i)<=1||dp[i+1][j-1]));
            }
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(dp[i][j]==true){
                    sum++;
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        countSubstrings("abc");
    }
}
