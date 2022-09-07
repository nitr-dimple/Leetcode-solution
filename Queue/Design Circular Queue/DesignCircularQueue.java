class MyCircularQueue {
    int queue[];
    int front;
    int rear;
    int size;
    int len;

    public MyCircularQueue(int k) {
        queue = new int[k];
        front = 0;
        rear = -1;
        size = k;
        len = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        rear = (rear+1)%size;
        queue[rear] = value;
        len++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty() ) return false;
        if(front == rear){
            front = 0;
            rear = -1;
        }
        else
            front = (front+1)%size;
        len--;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 :  queue[front];
        
    }
    
    public int Rear() {
        return isEmpty() ? -1 : queue[rear];
    }
    
    public boolean isEmpty() {
        return len == 0;
    }
    
    public boolean isFull() {
        return len == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */