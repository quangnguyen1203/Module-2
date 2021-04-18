public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.display();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.display();
        myQueue.enqueue(6);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.display();
        System.out.println(myQueue.getSize());
//        myQueue.diplayFront();
//        myQueue.diplayRear();

    }
}
