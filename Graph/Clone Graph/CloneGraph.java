/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Integer, Node> map = new HashMap<Integer, Node>();
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        map.put(node.val, new Node(node.val));
        
        for(Node n: node.neighbors){
            if(!map.containsKey(n.val))
                map.get(node.val).neighbors.add(cloneGraph(n));
            else
                map.get(node.val).neighbors.add(map.get(n.val));
                
        }
        return map.get(node.val);
        
    }
}