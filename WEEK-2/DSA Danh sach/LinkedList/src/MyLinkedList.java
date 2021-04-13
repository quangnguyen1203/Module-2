public class MyLinkedList<E> {
    private Node head;
    private  int numNodes;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getNumNodes(int i) {
        return numNodes;
    }

    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public MyLinkedList() {
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public void addLast(Object data) {
        Node temp = head;
        for(int i = 0; i < numNodes ; i++){
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void remove(int index){
        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void removeObj(Object o){
        Node temp = head;
        Node del = new Node(o);
        Node holder;
        Node delNode;
        while (temp.next != null){
            if (head.data == del.data){
                head = temp.next;
            } else if (temp.next.data == del.data) {
                delNode = temp.next;
                holder = delNode.next;
                temp.next = holder;
                delNode = null;
            }   else temp = temp.next;
        }
        numNodes--;
    }

    public MyLinkedList<E> clone(){
        MyLinkedList<E> llClone = new MyLinkedList<E>(this.head);
        Node temp = head;
        llClone.head.data = head.data;
        while (temp != null){
            llClone.addLast(temp.data);
            temp = temp.next;
        }
        return llClone;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}