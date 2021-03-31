import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        int dem = 0;
        for(int i = 2;;i++){
            int count=0;
            for(int j = 2; j <= i-1; j++){
                if ( i%j == 0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
                dem ++;
            }
            if (dem == 20){
                break;
            }
        }
    }
}
