class Solution {
    boolean visited[];
    ArrayList<ArrayList<Integer>> adj; 
    boolean cycleStack[];
    int ans[];
    int index= 0;
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        visited = new boolean[numCourses];
        adj = new ArrayList<ArrayList<Integer>>();
        cycleStack = new boolean[numCourses];
        ans = new int[numCourses];
        index = numCourses-1;
        
        for(int i = 0; i< numCourses; i++)
            adj.add(new ArrayList<Integer>());
        
        for(int i=0; i< prerequisites.length; i++)
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        
        for(int i = 0; i< numCourses; i++){
            if(!visited[i]){
                if(dfs(i))
                    return new int[0];
            }
        }
       return ans;     
        
    }
    
    public boolean dfs(int v){
        if(cycleStack[v]) return true;
        if(visited[v]) return false;
        
        visited[v] = true;
        cycleStack[v] = true;
        
        for(int w : adj.get(v)){
            if(dfs(w)) return true;
        }
        
        cycleStack[v] = false;
        ans[index--] = v;
        return false;
    } 
}