import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int[] tempArray = new int[n];
        System.arraycopy(arr, 0, tempArray, 0, n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tempArray[j] > tempArray[j + 1]) {
                    int tempVal = tempArray[j];
                    tempArray[j] = tempArray[j + 1];
                    tempArray[j + 1] = tempVal;
                }
            }
        }
        return tempArray;
    }

    public static void main(String[] args) {
        int[] OriginalArray = { 8, 1, 4, 9, 0, 3, 5, 2, 7, 6 };
        int[] sortArray = bubbleSort(OriginalArray);
        System.out.println(Arrays.toString(OriginalArray));
        System.out.println(Arrays.toString(sortArray));
    }
}