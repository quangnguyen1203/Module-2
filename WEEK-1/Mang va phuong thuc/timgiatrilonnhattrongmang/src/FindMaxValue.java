import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size: ");
        size = sc.nextInt();
        while (size > 20){
            System.out.println("Size should not exceed 20");
            break;
        }
        int[] arr;
        arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) Math.round(Math.random()*100);
        }
        System.out.printf("%-20s%s", "Element in array", "");
        for (int j=0; j<arr.length; j++){
            System.out.print(arr[j] + "\t");
        }
        System.out.println();
        int max = arr[0];
        for(int j = 0; j< arr.length; j++){
            if (arr[j] > max){
                max = arr[j];
            }
        }
        System.out.println("The largest value in the array is: " + max);
    }
}
