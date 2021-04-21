public class BinarySearchRecursive {


    public static int binarySearchRecursive(int[] list, int low, int high, int value) {
        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (list[mid] == value)
            return mid;
            if (list[mid] > value)
            return binarySearchRecursive(list, low, mid - 1, value);
            return binarySearchRecursive(list, mid + 1, high, value);
        }
        return -1;
    }

    public static void main (String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = binarySearchRecursive(arr, 0, 10, 3);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
