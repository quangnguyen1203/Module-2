public class BubbleSortTest {
    public static void main(String[] args) {
        int[] test = new int[6];
        test[0] = 2;
        test[1] = 9;
        test[2] = 5;
        test[3] = 6;
        test[4] = 7;
        test[5] = 8;

//        for (int i = 0; i < test.length; i++) {
//            test[i] = (int) Math.round(Math.random()*100);
//        }

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Mảng trước khi sắp xếp");
        bubbleSort.display( test);
        System.out.println("\n******************");
        bubbleSort.bubbleSort(test);
        System.out.println("\n******************");
        System.out.println("\n Mảng sau khi sắp xếp");
        bubbleSort.display(test);

//        Scanner sc = new Scanner(System.in);
//
//        String[] test1 = new String[5];
//        for (int i = 0; i < test1.length ; i++) {
//            test1[i] = sc.nextLine();
//        }
//        System.out.println("**************");
//        System.out.println(Arrays.toString(test1));
//        System.out.println("**************");
//        BubbleSortString bubbleSortString = new BubbleSortString();
//        bubbleSortString.bubbleSort(test1);
//

//        BubbleSortRecursive b = new BubbleSortRecursive();
//        System.out.println("Mảng trước khi sắp xếp");
//        b.display(test);
//
//        b.bubbleSortRecursive(test);
//
//       System.out.println("\n Mảng sau khi sắp xếp");
//       b.display(test);
    }
}
