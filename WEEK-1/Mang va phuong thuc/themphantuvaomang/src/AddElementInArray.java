import java.util.Scanner;

public class AddElementInArray {
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
        insert(12,4,arr);

    }

    public static int[] array(int size) {
        int[] array = new int[size + 1];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
        return array;
    }

    public static void insert(int value, int index, int[] arr) {
        for (int i = arr.length - 1; i >= index; i--) {
            if (i != index) {
                arr[i] = arr[i - 1];
            } else {
                arr[index] = value;
            }
        }
        for (int x : arr
        ) {
            System.out.print(x + "  ");
        }
    }
}

