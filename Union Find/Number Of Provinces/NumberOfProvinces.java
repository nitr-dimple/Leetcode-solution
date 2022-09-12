class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        boolean visited[] = new boolean[isConnected.length];
        for(int i = 0;i < isConnected.length; i++){
            if(visited[i] == false){
                dfs(isConnected, visited, i);
                count++;
            }
        }
        return count;
    }    
    
    public void dfs(int[][] isConnected, boolean visited[] , int i){
        for(int j = 0; j< isConnected[i].length; j++){
            if(isConnected[i][j] == 1 && visited[j] == false){
                visited[j] = true;
                dfs(isConnected, visited, j);
            }
        }
    }
}