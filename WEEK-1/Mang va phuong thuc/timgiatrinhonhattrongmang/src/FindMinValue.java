import java.util.Scanner;

public class FindMinValue {
    public static int[] arr(int size){
        int[] arr = new int[size];
        for (int i = 0; i< arr.length; i++ ){
            arr[i] = (int) Math.round(Math.random()*100);
        }
        return arr;
    }
    public static int minValue(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size: ");
        int size = sc.nextInt();
        int[] array = arr(size);
        System.out.print("Phan tu trong mang: ");
        for (int i :
                array) {
            System.out.print(i+"   ");
        }
        System.out.println();
        System.out.println("Gia tri nho nhat la: " + minValue(array));
    }
}
