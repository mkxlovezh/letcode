package examination;

public class Question867 {
    public int[][] transpose(int[][] A) {
        int row=A.length;
        int col=A[0].length;
        int[][] newA=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                newA[j][i]=A[i][j];
            }
        }
        return newA;

    }
}
