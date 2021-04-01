import java.util.Scanner;

public class RemoveValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size: ");
        int size = sc.nextInt();
        int[] arr = array(size);
        for (int x : arr
        ) {
            System.out.print(x + "  ");
        }
        System.out.println();
        System.out.println("Nhap chi so index: ");
        int index = sc.nextInt();
        DeleteValue(index,arr);
    }

    public static int[] array(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
        return array;
    }

    public static void DeleteValue(int index, int[] arr) {
        for (int i = index; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        for (int x: arr
        ) {
            System.out.print(x + "  ");
        }
    }
}
