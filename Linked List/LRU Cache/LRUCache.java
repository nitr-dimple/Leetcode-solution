class LRUCache {

    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }

    }

    int capacity;
    HashMap<Integer, Node> map;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        map = new HashMap<Integer, Node>();
        head = new Node(0,0);
        tail = new Node(0,0);
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            removeNode(node);
            addNode(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(!map.containsKey(key)){
            if(map.size() == this.capacity){
                Node last = tail.prev;
                removeNode(last);
                map.remove(last.key); 
            }
        } else{
            removeNode(map.get(key));
        }
        Node newnode =  new Node(key, value);
        map.put(key, newnode);
        addNode(newnode);
    }

    public void addNode(Node node){
        Node head_next = head.next;
        node.next = head_next;
        head_next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void removeNode(Node node){
        Node prev_node = node.prev;
        Node next_node = node.next;
        prev_node.next = next_node;
        next_node.prev = prev_node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */