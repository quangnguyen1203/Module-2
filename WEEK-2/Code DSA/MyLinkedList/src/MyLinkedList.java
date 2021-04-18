import javax.swing.text.TabExpander;

public class MyLinkedList<E> {
        private Node<E> head;
        private Node<E> tail;
        private int size;

    public void addFirst(E e) {
        Node temp = new Node<>(e);
        if (this.tail == null) {
            this.tail = this.head = temp;
        }
        temp.next = this.head;
        this.head = temp;
        size++;
    }

    public void addLast(E element) {
        Node temp = new Node<>(element);
        if (this.tail == null) {
            this.head = this.tail = temp;
        } else {
            this.tail.next = temp;
            this.tail = temp;
        }
        size++;
    }

    public void add(int index, E element) {
        if (index == 0) {
            addFirst(element);
        } else if (index >= size) {
            addLast(element);
            } else {
                Node current = this.head;
                for (int i = 1; i < index; i++){
                    current = current.next;
                }
                Node temp = current.next;
                current.next = new Node(element);
                temp.next = temp;
                size++;
            }
    }

    public E removeFirst() {
        if (size == 0){
            return null;
        } else {
            Node temp = this.head;
            this.head = temp.next;
            size--;
            if (this.head == null) {
                this.tail = null;
            }
            return (E) temp.element;
        }
    }

    public E removeLast() {
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

    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        else if (index == 0) {
            return removeFirst();
        }
        else if (index == size - 1){
            return removeLast();
        }
        else {
            Node previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node current = previous.next;
            previous.next = current.next;
            size--;
            return (E) current.element;
        }
    }

    public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println( temp.element);
                temp = temp.next;
            }
        }
    }
