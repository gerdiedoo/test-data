import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry; // You may need it to implement fastSort

public class QuickInsertionSort {
	private static void quickSort (int[] list, int start, int end) {
		if (list.length <= 1) {
			return;
		}
		int pivot = list[start + (end-start)/2];
		int i = start;
		int j = end;

		while (i<=j) {
			while (list[i] > pivot) {
				i++;
			}
			while (list[j] < pivot) {
				j--;
			}
			if (i <= j) { // swap i and j
				int tmp = list[i];
				list[i] = list[j];
				list[j] = tmp;
				i++;
				j--;
			}
		}

		if (start < j){
			if ((j-start) <= 10) {
				InsertionSort.sort(list,start,j);
			} else {
				quickSort(list, start, j);
			}
		}
		if (end > i){
			if ((end-i) <= 10) {
				InsertionSort.sort(list,i,end);
			} else {
				quickSort(list, i, end);
			}
		}
	}

	public static int[] sort(int[] results) {
	    quickSort(results,0, results.length-1);
	    return results;
    }
}