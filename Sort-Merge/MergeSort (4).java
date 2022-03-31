package hr.sortingalgorithms;

import hr.sortingalgorithms.SortingAlgorithm;

import java.util.ArrayList;

public class MergeSort implements SortingAlgorithm
{

	@SuppressWarnings("unchecked")
	public <T extends Comparable> void sort(T[] array)
	{
		mergeSort(array, 0, array.length - 1);
	}

	@SuppressWarnings("unchecked")
	private <T extends Comparable> void mergeSort(T[] array, int left, int right)
	{
		if (left < right)
		{
			int middle = left + (right - left)/2;
			mergeSort(array, left, middle);
			mergeSort(array, middle + 1, right);
			merge(array, left, middle, right);
		}
	}

	@SuppressWarnings("unchecked")
	private <T extends Comparable> void merge(T[] array, int left, int middle, int right)
	{
		int lengthOfLeftSubArray = middle - left + 1;
		int lengthOfRightSubArray = right - middle;

		ArrayList<T> leftSubArray = new ArrayList<T>();
		ArrayList<T> rightSubArray = new ArrayList<T>();

		for (int counter = 0; counter < lengthOfLeftSubArray; counter++)
			leftSubArray.add(array[left + counter]);
		for (int counter = 0; counter < lengthOfRightSubArray; counter++)
			rightSubArray.add(array[middle + 1 + counter]);
		
		int arrayIndex = left;
		int leftSubArrayIndex = 0;
		int rightSubArrayIndex = 0;

		while (leftSubArrayIndex < lengthOfLeftSubArray && rightSubArrayIndex < lengthOfRightSubArray)
		{
			if (leftSubArray.get(leftSubArrayIndex).compareTo(rightSubArray.get(rightSubArrayIndex)) < 0)
			{
				array[arrayIndex] = leftSubArray.get(leftSubArrayIndex);
				leftSubArrayIndex++;
			}
			else
			{
				array[arrayIndex] = rightSubArray.get(rightSubArrayIndex);
				rightSubArrayIndex++;
			}
			arrayIndex++;
		}

		while (leftSubArrayIndex < lengthOfLeftSubArray)
		{
			array[arrayIndex] = leftSubArray.get(leftSubArrayIndex);
			arrayIndex++;
			leftSubArrayIndex++;
		}

		while (rightSubArrayIndex < lengthOfRightSubArray)
		{
			array[arrayIndex] = rightSubArray.get(rightSubArrayIndex);
			arrayIndex++;
			rightSubArrayIndex++;
		}
	}

}
