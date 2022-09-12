class Solution {
    int max = 0, col = 0, row = 0, ans = 0;
    public int maxAreaOfIsland(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        for(int i = 0; i< row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    dfs(grid, i, j);
                    max = max > ans ? max : ans;
                    ans = 0;
                }
            }
        }
        return max;
    }
    
    public void dfs(int[][] grid,int i,int j){
        if(i < 0 || j <0 || i >= row || j >= col) return;
        if(grid[i][j] == 1){
            ans++;
            grid[i][j] = 2;
            dfs(grid, i+1, j);
            dfs(grid, i-1, j);
            dfs(grid, i, j+1);
            dfs(grid, i, j-1);
        }
    }
}