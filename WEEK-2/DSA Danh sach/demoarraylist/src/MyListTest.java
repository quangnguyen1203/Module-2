public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ll = new MyList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

//        MyList<Integer> arr = ll.clone();
//        for (int i = 0; i < arr.getSize(); i++) {
//            System.out.print(arr.get(i) + "  ");
//
//        }
        System.out.println(ll.contains(9));

        System.out.println(ll.indexOf(4));

        ll.display();
    }
}
