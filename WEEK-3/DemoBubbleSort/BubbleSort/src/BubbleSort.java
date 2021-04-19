import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort(int[] arr){
        boolean swapped = false;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for ( int j = 0; j < arr.length - 1 - i; j++) {
                System.out.print("So sanh cac phan tu: [" + arr[j] + ", " + arr[j + 1] + "]");

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                    System.out.println(" => trao doi [" + arr[j] + ", " + arr[j + 1] + "]");
                } else {
                    System.out.println(" => khong can trao doi.");
                }
            }
            if (!swapped) {
                break;
            }
            System.out.println("Vong lap thu " + (i + 1));
            display(arr);
        }
    }

    public void display(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println("");
    }

}
