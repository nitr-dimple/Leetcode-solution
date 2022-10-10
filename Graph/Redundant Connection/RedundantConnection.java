class Solution {
    int id[];
    public int[] findRedundantConnection(int[][] edges) {
        
        id= new int[edges.length + 1];
        for(int i=0; i<= edges.length; i++ )
            id[i] = i;
        
        for(int edge[] :edges){
            int pid = find(edge[0]);
            int qid = find(edge[1]);
            if(pid != qid)
                id[pid] = qid;
            else return edge;
        }
        return new int[2];
 
    }
    
    public int find(int p){
        while(p != id[p]){
            id[p] = id[id[p]];
            p = id[p];
        }
        return p;
        
    }
    
}