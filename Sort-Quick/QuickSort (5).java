package sams.steven.algorithms;

/**
 * Title:        QuickSort Algorithm
 * Description:  A Divide and Conquer algorithm to sort an array of random values into ascending order
 * Company:      DISC Brunel University
 * @author       Steven Sams
 * @version 1.0
 */

public class QuickSort
{
    private static int quick(int a[], int start, int end) {
        int pivotValue = a[start]; 	 // assign pivot value to the first value in the array
        int pivot = start;		    //assign the pivot point as the first element of the array

        //scan the array
        for (int i = start + 1; i <= end; i++) {
            if (a[i] < pivotValue) {
                //when value at a[i] is < the pivot value increment pivot point
                pivot++;
                sort(a,pivot,i); //move the pivot point along
            }
        }

        sort(a, start, pivot);  //swap pivot value into correct location
        return pivot;          //return pivot point to the quicksort method
    }

    private static void quickSort ( int a[], int start, int end) {
        if(start < end) {
            int pivot = quick(a, start, end);  // assign new pivot value from quick method
            quickSort(a, start, pivot-1);     // recursive call on array containing elements < the pivot point
            quickSort(a, pivot+1, end);      // recursive call on array containing elements > the pivot point
        }
    }

    private static void sort(int a[],int start,int pivot) {
        int temp;
        temp = a[start];
        a[start] = a[pivot];
        a[pivot] = temp;
    }
}