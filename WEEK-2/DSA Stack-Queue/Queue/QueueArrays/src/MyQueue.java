public class MyQueue<E> {
    public int front = 0;
    public int rear = 0;
    public int capacity;
    public E[] queueArr;

    public MyQueue(int capacity) {
        this.front = 0;
        this.rear = 0;
        this.capacity = capacity;
        this.queueArr = (E[]) new Object[capacity];
    }

    public void enqueue(E data){
        if (this.rear == capacity){
            System.out.println("Queue is full");

        } else {
            queueArr[rear] = data;
            rear++;
        }
    }

    public E dequeue(){
        if(this.rear == this.front){
            System.out.println("Queue is empty");
            return null;
        }
        E temp = queueArr[0];
        for (int i = 0; i < this.rear - 1 ; i++) {
            queueArr[i] = queueArr[i+1];
        }
        if (rear < capacity) {
            queueArr[rear] = null;
        }
        rear--;
        return temp;
    }

    public void display(){
        if(this.rear == this.front){
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.println("\n"+ "Queue element is: " + queueArr[i] + " ");
        }
    }

    public void diplayFront(){
        if(this.rear == this.front){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("\n"+ "Front element is: " + queueArr[front]);
    }

    public void diplayRear(){
        if(this.rear == this.front){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("\n"+ "Rear element is: " + queueArr[rear]);
    }
}
