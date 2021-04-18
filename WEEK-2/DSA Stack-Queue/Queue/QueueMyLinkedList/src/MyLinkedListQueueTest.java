public class MyLinkedListQueueTest {
    public static void main(String[] args) {
//        MyLinkedListQueue<Integer> q = new MyLinkedListQueue<>();
//        q.enqueue(1);
//        q.enqueue(5);
//        q.enqueue(123);
//        q.enqueue(6);
//        q.enqueue(56);
//        q.enqueue(23);
//        q.display();
//        System.out.println("***********************");
//        q.dequeue();
//        q.dequeue();
//        q.display();

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
