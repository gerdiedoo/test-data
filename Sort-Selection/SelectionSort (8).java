package sams.steven.algorithms;

/**
 * Title:        Selection Sort Algorithm
 * Description:  An algorithm to sort an array of random values into ascending order
 * Company:      DISC Brunel University
 * @author       Steven Sams
 * @version 1.0
 */

public class SelectionSort
{
    private static int[] SelectionSort(int[] a) {

        int temp;
        for (int i = 0; i < a.length; i++) {

            /* Assume that the first or next
            index contains the smallest value */
            int min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[min] >= a[j]) {
                    /* Replace the index of the minimum
                    value if a smaller value is found */
                    min = j;
                }
            }
            temp = a[i];    //Copy the current index of a into temp
            a[i] = a[min];  //Copy the smaller value into the current index of a
            a[min] = temp;  //Copy the temp value into the previous location of the smaller element
        }
        return a;
    }
}