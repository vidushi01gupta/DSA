class Solution {
    public static int closedIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    if(dfs(grid,i,j)){
                        count++;
                    }
                }

            }
        }
        return count;
        
    }
    public static boolean dfs(int grid[][], int r,int c){
        int m=grid.length;
        int n=grid[0].length;
        if(r<0 || c<0 || r>=m || c>=n){
            return false;
        }
        if(grid[r][c]==1){
            return  true;
        }
        grid[r][c]=1;
        boolean top=dfs(grid,r-1,c);
        boolean bottom=dfs(grid,r+1,c);
        boolean left=dfs(grid,r,c-1);
        boolean right=dfs(grid,r,c+1);
        return top && bottom && left && right;

    }
}