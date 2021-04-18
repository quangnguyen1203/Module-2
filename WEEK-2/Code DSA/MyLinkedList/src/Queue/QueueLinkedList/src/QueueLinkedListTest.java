package Queue.QueueLinkedList.src;

public class QueueLinkedListTest {
    public static void main(String[] args) {
        QueueLinkedList<Integer> q = new QueueLinkedList<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();
        System.out.println();
        q.dequeue();
        q.dequeue();
        q.display();
    }
}
