package Queue.QueueMyLinkedList.src;

import com.quang.MyLinkedList.MyLinkedList;

public class MyLinkedListQueue<E> {
    private MyLinkedList<E> queue;

    public MyLinkedListQueue() {
        queue = new MyLinkedList<>();
    }

    public void enqueue(E element){
        queue.addLast(element);
    }

    public E dequeue(){
        if (queue.isEmpty()){
            return null;
        } else {
            return queue.removeFirst();
        }
    }

    public void display(){
        queue.display();
    }
}
