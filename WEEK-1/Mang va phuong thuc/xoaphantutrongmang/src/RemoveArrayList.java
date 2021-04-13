import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.*;

public class RemoveArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for ( int i = 0; i < n; i++) {
            int j = (int) Math.round(Math.random()*100);
            arr.add(j);
        }
        System.out.println(arr);
        int index = sc.nextInt();
        arr.remove(index);
        System.out.println(arr);
    }
}
