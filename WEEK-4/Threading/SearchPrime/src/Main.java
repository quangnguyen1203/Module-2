import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);


    public static boolean isPrime(int n){
        if(n < 2)
            return false;
        else
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if(n%i==0)
                    return false;
            }
        return true;
    }

    public static boolean checkNumber(int n){
        if(n>=2){
            for(int i=2;i<n;i++){
                if(n%i==0) {
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new OptimizedPrimeFactorization());
        Thread t2 = new Thread(new LazyPrimeFactorization());
        t1.start();
        t2.start();
    }
}
