class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean marked[] = new boolean[n];
        marked[source] = true;
        boolean flag = true;
        
        while(!marked[destination] && flag){
            flag = false;
            for(int i = 0; i< edges.length; i++){
                if(marked[edges[i][0]] == marked[edges[i][1]]) continue;
                if(!marked[edges[i][0]]) marked[edges[i][0]] = true;
                else marked[edges[i][1]] = true;
                flag = true;
                if(marked[destination]) return true;
            }
        }
        
        return marked[destination];
    }
}