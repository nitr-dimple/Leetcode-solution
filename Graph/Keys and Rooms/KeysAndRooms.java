class Solution {
    boolean visited[];

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        
        dfs(rooms, 0);
        
        for(int i=0; i< rooms.size(); i++)
            if(!visited[i]) return false;
        return true;
        
    }
    
    public void dfs(List<List<Integer>> rooms, int v){
        visited[v] = true;
        
        for(Integer w: rooms.get(v)){
            if(!visited[w]) dfs(rooms, w);
        }
    }
}