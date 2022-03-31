package SortingAlgorithms;

import java.util.Arrays;

/**
 * divides the input arr in two halves, calls itself for the two halves and then merges the two sorted halves.
 * the merge() function is used for merging the two halves. it merges two sorted sub arrays
 * */

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {9,8,3,4,6,4,3};
        // call merge sort on it
        sort(array,array.length);
        System.out.println(Arrays.toString(array));
    }

    /** Sorts  */
    private static void sort(int[] array, int length){
        // if first index is less than the last
        if (length < 2) {
            return;
        }
        // find the middle
        int middle = length / 2;
        // save the two parts
        int[] leftSide = new int[middle];
        int[] rightSide = new int[length - middle];

        /** populate the arrays */
        //populate the left side of the array
        for (int i = 0; i < middle; i++) {
            leftSide[i] = array[i];
        }
        //populate the right side of the array
        for (int i = middle; i < length; i++) {
            rightSide[i - middle] = array[i];
        }

        sort(leftSide,middle);
        sort(rightSide,length - middle);

        // merge all the subarrays in sorted order
        // middle is 3 and lenght - middle is 7 - 3 = 4
        mergeArrays(array, leftSide, rightSide, middle, length - middle);
    }

    public static void mergeArrays(int arr[], int[] leftSide, int[] rightSide, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (leftSide[i] <= rightSide[j]) {
                arr[k++] = leftSide[i++];
            } else {
                arr[k++] = rightSide[j++];
            }
        }

        // while i is less than 3 which is the end of the left arr
        while (i < left) {
            // add them
            arr[k++] = leftSide[i++];
        }

        while (j < right) {
            // add them
            arr[k++] = rightSide[j++];
        }
    }

}
