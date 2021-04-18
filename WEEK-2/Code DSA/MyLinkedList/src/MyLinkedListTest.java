public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> ll = new MyLinkedList<>();
        ll.add(0,"quang");
        ll.add(1,"thien");
        ll.add(2,"nam");
        ll.add(3,"long");
        ll.addFirst("huy");
        ll.addLast("binh");
        ll.removeFirst();
        ll.removeLast();
        ll.display();
    }

}
