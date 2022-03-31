package SortingAlgorithms;

import java.util.Arrays;
// Insertion sort works by starting the sorting from index 1 in the array
// and going back and checking if it needs to be sorted somewhere else, by checking if
// i - 1 (until you reach 0)
public class InsertionSort {
    public static void main(String[] args) {
        int[] input = {6,4,2,0,6,5,4,7,5,6,4,3,2,2,4,5,67,32,55,4,44,445};
        insertionSort(input);

        InsertionSort obj = new InsertionSort();
    }

    public static void insertionSort(int[] input) {
        // [3,2,5,8]
        // [2,3,4,8]
        int length = input.length;

        // start iterating over index 1
        for (int i = 0; i < length; i++) {
            // save some ints

            int currentValue = input[i];
            int previousIndex = i - 1;

            // while previous index is more than or equal to 0 and larger than the current value, switch and keep going
            while (previousIndex >= 0 && input[previousIndex] > currentValue) {
                input[previousIndex + 1] = input[previousIndex];
                previousIndex = previousIndex - 1;
            }

            input[previousIndex + 1] = currentValue;
        }
        System.out.println(Arrays.toString(input));
    }
}
