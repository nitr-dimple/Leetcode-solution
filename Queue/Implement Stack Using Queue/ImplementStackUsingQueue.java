class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;


    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();  

    }
    
    public void push(int x) {
        q2.add(x);
        while(q1.size()!= 0){
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q3 =q1;
        q1 = q2;
        q2 = q3;
    }
    
    public int pop() {
        // System.out.println(q1.poll());
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */