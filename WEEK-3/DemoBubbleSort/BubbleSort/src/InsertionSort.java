public class InsertionSort {
    void sort(int[] arr){
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


    void sortRecursive(int[] arr, int n){
        if (n <= 1) return;

        sortRecursive(arr, n-1);

        int last = arr[n-1];
        int j = n-2;

        while (j>=0 && arr[j]>last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    void sortRecursive(int[] arr){
        sortRecursive(arr,arr.length);
    }

    static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,1,5,8,6};

        InsertionSort ob = new InsertionSort();

        ob.sortRecursive(arr);

        display(arr);
    }
}
