package SortingAlgorithms;

import java.util.Arrays;
// add some comments
// create a great portfolio and maybe share stuff on LinkedIn.
//
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] input) {
        boolean isSorted = false;
        int lastUnsorted = input.length - 1;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < lastUnsorted; i++) {
                if (input[i] > input[i + 1]) {
                    swapElements(input, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
        System.out.println(Arrays.toString(input));
    }

    private static void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
