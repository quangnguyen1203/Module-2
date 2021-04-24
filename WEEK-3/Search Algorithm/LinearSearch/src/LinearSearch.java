import java.util.Arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr, int x){
        int n = arr.length;
        int holder = - 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                holder = i;
            }
        }
        return holder;
    }



    public static int secondMin(int[] arr){
        int minIndex = 0;
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            if(arr[minIndex] > arr[i]){
                minIndex = i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[0];
        arr[0] = arr[minIndex];
        minIndex = 1;
        for (int i = 1; i < n ; i++) {
            if(arr[minIndex] > arr[i]){
                minIndex = i;
            }
        }
        return arr[minIndex];
    }

    public int countSearch(int[] arr,int x){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == x){
                count++;
            }
        }
        return count;
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
        int[] arr = {1,3,9,4,7,52,8,6,7,2,34,78};
        System.out.println(Arrays.toString(arr));
        LinearSearch ls = new LinearSearch();
//        ls.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println();
        int result = linearSearch(arr,7);
        System.out.println("số lần xuất hiện là " + ls.countSearch(arr,7));
        System.out.println(secondMin(arr));
        if(result == -1){
            System.out.print("Element is not present in array");
        } else {
            System.out.print("Element is present at index " + result);
        }
    }
}
