class MyCircularDeque {
    int size;
    int deque[];
    int front;
    int rear;
    int len;

    public MyCircularDeque(int k) {
        size = k;
        deque = new int[k];
        front = -1;
        rear = -1;
        len = 0;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        if(front == -1){
            front = 0;
            rear = 0;
        }
        else
            front = (front - 1 + size)%size;
        deque[front] = value;
        len++;
        return true;
        
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        if(rear == -1) front = 0;
        rear = (rear+1)%size;
        deque[rear] = value;
        len++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else
            front = (front+1)%size;
        len--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else
            rear = (size + rear - 1)%size;
        len--;
        return true;
        
    }
    
    public int getFront() {
        return isEmpty() ? -1  : deque[front];
        
    }
    
    public int getRear() {
        return isEmpty() ? -1 : deque[rear];
    }
    
    public boolean isEmpty() {
        return len == 0;
    }
    
    public boolean isFull() {
        return len == size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */