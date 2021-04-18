package Queue.QueueMyLinkedList.src;

public class MyLinkedListQueueTest {
    public static void main(String[] args) {

        MyLinkedListQueue<String> myLinkedListQueue = new MyLinkedListQueue<>();
        myLinkedListQueue.enqueue("Nam Tran");
        myLinkedListQueue.enqueue("Quang Shipper");
        myLinkedListQueue.enqueue("Long Dau Bo");
        myLinkedListQueue.enqueue("Bình Hụ");
        myLinkedListQueue.enqueue("Thien Tatoo");
        myLinkedListQueue.display();
        System.out.println("*************************");

        System.out.println(myLinkedListQueue.dequeue());
        System.out.println(myLinkedListQueue.dequeue());
//        myLinkedListQueue.dequeue();
        System.out.println("*************************");
//        myLinkedListQueue.dequeue();
//        myLinkedListQueue.dequeue();
//        System.out.println(myLinkedListQueue.peek());
//        System.out.println(myLinkedListQueue.dequeue());
        myLinkedListQueue.display();
    }
}
