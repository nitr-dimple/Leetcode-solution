class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> ans = new ArrayList<Integer>();
        int indegree[] = new int[n];
        if(n == 0) return ans;
        if(n == 1) {
            ans.add(0);
            return ans;
        }
        
        List<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<n; i++)
            adj.add(new ArrayList<Integer>());
        
        for(int i=0; i<edges.length; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
            indegree[edges[i][0]]++;
            indegree[edges[i][1]]++;
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0; i< n; i++){
            if(adj.get(i).size() == 1) queue.add(i);
        }

        while(n > 2){
            int len = queue.size();
            n = n-len;
            for(int i=0; i< len; i++){
                int removeEle = queue.poll();
                for(int ele: adj.get(removeEle)){
                    indegree[ele]--;
                    if(indegree[ele] == 1)
                        queue.add(ele);
                }
            }
        }

        while(queue.size() != 0){
            ans.add(queue.poll());
        }

        return ans;
         
    }
}