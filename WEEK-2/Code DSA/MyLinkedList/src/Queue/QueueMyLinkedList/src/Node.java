package Queue.QueueMyLinkedList.src;

public class Node<E> {
    public E key;
    public Node next;

    public Node(E key) {
        this.key = key;
        this.next = null;
    }
}
