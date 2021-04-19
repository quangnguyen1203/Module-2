import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortTest {
    public static void main(String[] args) {
//        int[] test = new int[10];
//
//        for (int i = 0; i < test.length; i++) {
//            test[i] = (int) Math.round(Math.random()*100);
//        }
//
//        BubbleSort bubbleSort = new BubbleSort();
//        System.out.println("Mảng trước khi sắp xếp");
//        bubbleSort.display( test);
//        System.out.println("\n******************");
//        bubbleSort.bubbleSort(test);
//        System.out.println("\n******************");
//        System.out.println("\n Mảng sau khi sắp xếp");
//        bubbleSort.display(test);

        Scanner sc = new Scanner(System.in);

        String[] test1 = new String[5];
        for (int i = 0; i < test1.length ; i++) {
            test1[i] = sc.nextLine();
        }
        System.out.println("**************");
        BubbleSortString bubbleSortString = new BubbleSortString();
        bubbleSortString.bubbleSort(test1);
    }
}
