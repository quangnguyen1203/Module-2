public class ThreadTest {
    public static void main(String[] args) {
        NumberGenerator n1 = new NumberGenerator();
//        Thread t1 = new Thread(n1);
        n1.setName("a");
        NumberGenerator n2 = new NumberGenerator();
//        Thread t2 = new Thread(n2);
        n2.setName("b");
        n1.setPriority(1);
        n2.setPriority(10);


        n1.start();
        n2.start();
    }
}
