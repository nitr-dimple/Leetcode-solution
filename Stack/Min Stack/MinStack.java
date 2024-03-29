class MinStack {
    Stack<Integer> stk;
    int min;

    public MinStack() {
        stk = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(min >= val){
            stk.push(min);
            min = val;
        }
        stk.push(val);
    }
    
    public void pop() {
        int val = stk.pop();
        if(val == min) min = stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */