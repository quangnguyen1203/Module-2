public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
//        ll.add(0,1);
        ll.add(0,2);
        ll.add(1,3);
        ll.add(2,4);
        ll.add(3,5);
//        ll.addLast(435);
        ll.addFirst(1);
//        ll.remove(2);
//        ll.removeObj(3);
//        ll.clone();
        ll.printList();
    }
}
