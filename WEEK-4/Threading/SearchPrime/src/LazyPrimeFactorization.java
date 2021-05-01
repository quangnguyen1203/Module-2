public class LazyPrimeFactorization implements Runnable {


    @Override
    public void run() {
        for (int i = 2; i < 1000 ; i++) {
            if(Main.checkNumber(i)){
                System.out.println("LazyPrime: " + i);
            }
        }
        System.out.println("LazyPrime finish!");
    }
}
