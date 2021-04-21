import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] list, int value){
        int low = 0;
        int high = list.length - 1;
        while (high >= low){
            int mid = ( low + high )/2;
            if (list[mid] > value){
                high = mid - 1;
            } else if (list[mid] < value){
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public void sort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j -=1;
            }
            arr[j + 1] = key;
        }

    }

    public static void main(String[] args) {
//        int[] arr = new int[5];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        System.out.println("Mảng trước khi sắp xếp");
        int[] arr = {1, 3, 34, 1, 76, 8, 10, 56, 4, 8, 99};
        System.out.println(Arrays.toString(arr));
        BinarySearch b = new BinarySearch();
        b.sort(arr);
        System.out.println("Mảng sau khi sắp xếp");
        System.out.println(Arrays.toString(arr));
        System.out.println("*****************************");
        int result = binarySearch(arr,10);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
