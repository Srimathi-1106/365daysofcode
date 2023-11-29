// LEETCODE PROBLEM - 622. Design Circular Queue

class MyCircularQueue {
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    Node head,tail;
    int size,maxSize;
    public MyCircularQueue(int k) {
        size=0;
        maxSize=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
        return false;
        if(isEmpty())
        {
            head=new Node(value);
            head.next=head;
            tail=head;
            size++;
            return true;
        }
        Node newNode=new Node(value);
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
        return false;
        head=head.next;
        tail.next=head;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty())
        return -1;
        return head.data;
    }
    
    public int Rear() {
        if(isEmpty())
        return -1;
        return tail.data;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==maxSize;
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