public class StackMyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public StackMyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void push(E element) {
        Node temp = new Node<>(element);
        if (this.tail == null) {
            this.tail = this.head = temp;
        }
        temp.next = this.head;
        this.head = temp;
        size++;
    }

    public E pop() {
        if (size == 0){
            return null;
        } else if (size == 1) {
            Node temp = head;
            head = tail = null;
            size = 0;
            return (E) temp.element;
        } else {
            Node current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            Node temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return (E) temp.element;
        }
    }

    public E peek(){
        if (size < 0){
            System.out.println("Stacl is empty");
        }
        E temp = (E) this.tail;
        return temp;
    }

    public int search(E e){
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            if((E) temp.element == e){
                return i;
            }
        }
        return -1;
    }

    public void display() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println( temp.element);
            temp = temp.next;
        }
    }
}

