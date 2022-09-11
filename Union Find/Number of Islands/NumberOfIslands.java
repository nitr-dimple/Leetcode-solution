class Solution {
    int row = 0;
    int col = 0;
    public int numIslands(char[][] grid) {
        row = grid.length;
        col = grid[0].length;
        int count = 0;
        
        for(int i = 0; i< row; i++){
            for(int j = 0; j< col; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
    
    public void dfs(char[][] grid,int i,int j){
        if(i < 0 || j < 0 || i >= row || j >= col) return;
        if(grid[i][j] == '1'){
            grid[i][j] = 'X';
            dfs(grid, i+1, j);
            dfs(grid, i-1, j);
            dfs(grid, i, j+1);
            dfs(grid, i, j-1);
        }
    }
}