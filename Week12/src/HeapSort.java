import java.util.Arrays;

public class HeapSort {
    public static int[] heapSort(int[] arr) {
        int n = arr.length;
        int[] tempArray = new int[arr.length];
        System.arraycopy(arr, 0, tempArray, 0, arr.length); 

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(tempArray, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = tempArray[0];
            tempArray[0] = arr[i];
            tempArray[i] = temp;
            heapify(tempArray, i, 0);
        }

        int[] newArray = new int[arr.length];
        System.arraycopy(tempArray, 0, newArray, 0, arr.length);
        return newArray;
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] OriginalArray = { 8, 1, 4, 9, 0, 3, 5, 2, 7, 6 };
        int[] sortArray = heapSort(OriginalArray);
        System.out.println(Arrays.toString(OriginalArray));
        System.out.println(Arrays.toString(sortArray));
    }
}