public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if(Main.isPrime(i)) {
                System.out.println("OptimizedPrime: " + i);
            }
        }
        System.out.println("OptimizedPrime finish!");
    }
}
