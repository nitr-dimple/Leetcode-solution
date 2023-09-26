class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<String>();

        for(int i=0; i< 9; i++){
            for(int j=0; j<9; j++){

                char c = board[i][j];
                if(c != '.'){
                    if(!set.add(c + " row:" + i) || !set.add(c + " column:" + j) || !set.add(c + " row:" + i/3 +" column:" + j/3))
                        return false;
                }

            }
        }
        return true;
        
    }
}