package examination;

public class Question695 {
    int sum=0;
    public int maxAreaOfIsland(int[][] grid) {
        int high=grid.length;
        int width=grid[0].length;
        int result=0;
        for(int i=0;i<high;i++){
            for(int j=0;j<width;j++){
                if(grid[i][j]==1){

                    findArea(grid,i,j);
                    if(sum>result){
                        result=sum;
                    }
                    sum=0;
                }
            }
        }
        return result;
    }
    public void findArea(int[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0 || grid[i][j] == 2){
            return;
        }


        if(grid[i][j]==1){
            sum++;
            grid[i][j]=2;
        }


        findArea(grid,i-1,j);
        findArea(grid,i+1,j);
        findArea(grid,i,j-1);
        findArea(grid,i,j+1);
        return;
    }
}
