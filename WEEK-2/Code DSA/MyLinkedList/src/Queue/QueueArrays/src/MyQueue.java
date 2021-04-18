package Queue.QueueArrays.src;

import java.util.Arrays;

public class MyQueue<E> {
    public int front = 0;
    public int rear = 0;
    public int size;
    public E[] queueArr;

    public MyQueue() {
        this.front = 0;
        this.rear = 0;
        this.queueArr = (E[]) new Object[5];
    }

    public void ensureCapa(){
        int newSize = queueArr.length*2;
        queueArr = Arrays.copyOf(queueArr,newSize);
    }

    public void enqueue(E data){
            queueArr[rear] = data;
            ensureCapa();
            rear++;
            size++;
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
        if (rear < size) {
            queueArr[rear] = null;
        }
        rear--;
        size--;
        return temp;
    }

    public int getSize(){
        return this.size;
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
