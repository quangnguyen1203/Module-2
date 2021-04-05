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
        System.out.println("Input value: ");
        int value = sc.nextInt();
        int index = check(value,arr);
        if(index == -1){
            System.out.println("Not found");
        }else {
            System.out.println("New Array");
            DeleteValue(index, arr);
        }
    }

    static int check(int x,int[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x == y[i]) {
                return i;
            }
        }
        return -1;
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
        arr[arr.length-1]=0;
        for (int x: arr
        ) {
            System.out.print(x + "  ");
        }

    }
}
