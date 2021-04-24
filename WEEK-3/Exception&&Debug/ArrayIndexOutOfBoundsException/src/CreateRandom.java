import java.util.Random;
import java.util.Scanner;

public class CreateRandom {
    public int[] createRandom(){
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("Danh sach cac phan tu cua mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        CreateRandom create = new CreateRandom();
        int[] arr = create.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Vui long nhap chi so mot phan tu bat ki: ");
        int x = sc.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so 5" + x + " la " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Chi so vuot qua gioi han");
        }
    }
}
