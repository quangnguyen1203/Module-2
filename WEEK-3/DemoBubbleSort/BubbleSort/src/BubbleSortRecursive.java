public class BubbleSortRecursive {


    public static void bubbleSortRecursive(int[] arr, int n) {
        if(n==1) return;
        for(int i=0; i < n-1; i++) {
                if(arr[i]>arr[i+1]) {
                   int temp = arr[i];
                   arr[i]= arr[i+1];
                   arr[i+1] = temp;
                }
            }
        bubbleSortRecursive(arr,n-1);
    }
    public static void bubbleSortRecursive(int[] A){
        bubbleSortRecursive(A,A.length);
    }

    public void display(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println("");
    }
}
