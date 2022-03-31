package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 10,8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] inputArray, int startIndex, int endIndex) {
        // if 0 is less than 4 then proceed
        if (startIndex < endIndex) {
            int partitionIndex = partition(inputArray, startIndex, endIndex);
            quickSort(inputArray, startIndex, partitionIndex - 1);
            quickSort(inputArray, partitionIndex + 1, endIndex);
        }
    }

    /** The method to partition take the array, the start and the end indexes in range */
    private static int partition( int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

}
