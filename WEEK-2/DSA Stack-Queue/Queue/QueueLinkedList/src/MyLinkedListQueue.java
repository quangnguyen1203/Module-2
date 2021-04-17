
public class MyLinkedListQueue<E> {
    public Node<E> head;
    public Node<E> tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(E key){
        Node<E> temp = new Node<E>(key);
        if(this.head == null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public E dequeue(){
        if (head == null) return null;
        Node holder;
        Node temp = this.head;
        this.head = temp.next;
        holder = temp;
        temp = null;
        return (E) holder.key;
    }

    public E peek(){
        if(this.head == null){

            return (E)"Queue is empty";
        }
        return (E)this.head.key;
    }


    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println((E) temp.key);
            temp = temp.next;
        }
    }
}
