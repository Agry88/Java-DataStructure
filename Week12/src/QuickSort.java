import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] arr) {
        int n = arr.length;
        int[] tempArray = new int[n];
        System.arraycopy(arr, 0, tempArray, 0, n); 
        quicksort(tempArray, 0, n - 1);
        return tempArray;
    }

    public static void quicksort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int i = left;
        int j = right;
        int key = arr[i];
        while(i != j) {
            while (arr[j] > key && i < j) {
                j--;
            }
            while (arr[i] <= key && i < j) {
                i++;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            arr[left] = arr[i];
            arr[i] = key;
            quicksort(arr, left, i - 1);
            quicksort(arr, i + 1, right);
        }
    }
     
    

    public static void main(String[] args) {
        int[] OriginalArray = { 1, 2, 9, 6, 3, 7, 8, 5, 4 };
        int[] sortArray = quickSort(OriginalArray);
        System.out.println(Arrays.toString(OriginalArray));
        System.out.println(Arrays.toString(sortArray));
    }
}