public class BubbleSortString {
    public void bubbleSort(String[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for(int j = i+1; j < arr.length; j++){
                if (arr[i].compareTo(arr[j])>0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
