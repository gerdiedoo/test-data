package sams.steven.algorithms;

/**
 * Title:        Merge Sort Algorithm
 * Description:  A Divide and Conquer algorithm to sort an array of random values into ascending order
 * Company:      DISC Brunel University
 * @author       Steven Sams
 * @version 1.0
 */

public class MergeSort
{
    private static void merge(int[] a, int start, int mid, int end) {

        // size of the array be merged
        int n = end - start + 1;
        // intermediate storing array
        int[] temp = new int[n];
        // first element in the left sub array
        int left = start;
        // next element in the right sub array
        int right = mid + 1;
        // next position in temp
        int j = 0;

        /* Move the smaller element from left or right into temp while left and right have elements
        left to compare, continue while the left and right sub arrays have elements remaining */
        while (left <= mid && right <= end) {
            if (a[left] < a[right]) {   //when left sub array element is smaller than the corresponding right sub array element
                temp[j] = a[left];      //copy left sub array element into its correct position in temp array
                left++;		            //increment left sub array to the next element to be checked
            } else {                    //when right sub array element is smaller than the corresponding left sub array element
                temp[j] = a[right];
                right++;
            }
            j++;
        }

        /* The proceeding two while loops are mutually exclusive
        copy any remaining entries of the left sub array */
        while (left <= mid) {
            temp[j] = a[left];
            left++;
            j++;
        }

        // copy any remaining entries of the right sub array
        while (right <= end) {
            temp[j] = a[right];
            right++;
            j++;
        }

        // copy from the temp array
        for (j = 0; j < n; j++)
            a[start + j] = temp[j];
    }

    private static void sort(int[] a, int start, int end) {
        if (start == end) 	// the direct solution, list has 1 element and is therefore sorted
            return;     	// return to caller

        int mid = (start + end) / 2;    // find the centre element of the array
        sort(a, start, mid);            // recursively split the array down
        sort(a, mid + 1, end);    // along its centre element
        merge(a, start, mid, end);      // sub array recursively sorted up
    }
}