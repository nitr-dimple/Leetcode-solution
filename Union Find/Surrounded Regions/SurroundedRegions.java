class Solution {
    int row = 0;
    int col = 0;
    
    public void solve(char[][] board) {
        row = board.length;
        col = board[0].length;
        
        if(row <= 2  || col <=2) return;
        for(int i = 0; i < row; i++){
            if(board[i][0] == 'O')
                dfs(board, i, 0);
            if(board[i][col-1] == 'O')
                dfs(board, i, col-1);
        }
        for(int j = 1; j < col-1; j++){
            if(board[0][j] == 'O')
                dfs(board, 0, j);
            if(board[row-1][j] == 'O')
                dfs(board, row-1, j);
        }
        
        for(int i = 0; i< row; i++){
            for(int j = 0; j < col; j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                else if(board[i][j] == 'Y') board[i][j] = 'O';
            }
        }
    }
    
    public void dfs(char[][] board, int i, int j){
        if(i < 0 || j < 0 || i >= row || j >= col) return;
        if(board[i][j] == 'O'){
            board[i][j] = 'Y';
            dfs(board, i+1, j);
            dfs(board, i-1, j);
            dfs(board, i, j-1);
            dfs(board, i,  j+1);
        }
    }
}