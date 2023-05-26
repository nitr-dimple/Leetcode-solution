class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((n1, n2) -> n2 - n1 );
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                if(pq.size() == k){
                    if(pq.peek() > matrix[i][j]){
                        pq.poll();
                        pq.add(matrix[i][j]);
                    }
                    else
                        break;
                }
                else
                    pq.add(matrix[i][j]);
            }
        }
        return pq.poll();
        
    }
}