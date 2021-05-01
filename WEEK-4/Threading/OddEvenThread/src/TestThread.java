public class TestThread {
    public static void main(String[] args) {
        OddThread o = new OddThread();
        Thread t1 = new Thread(o);

        EvenThread e = new EvenThread();
        Thread t2 = new Thread(e);

        t1.setName("A");
        t2.setName("B");
//        t1.start();
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        t1.start();
    }
}
