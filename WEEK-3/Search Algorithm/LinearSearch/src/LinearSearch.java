import java.util.Arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr, int x){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x){
                return i;
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
        int[] arr = {1,3,9,4,7,52,8,6,2,34,78};
        System.out.println(Arrays.toString(arr));
        LinearSearch ls = new LinearSearch();
        ls.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int result = linearSearch(arr,4);
        if(result == -1){
            System.out.print("Element is not present in array");
        } else {
            System.out.print("Element is present at index " + result);
        }
    }
}
