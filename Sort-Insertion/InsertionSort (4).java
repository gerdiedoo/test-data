package hr.sortingalgorithms;

import hr.sortingalgorithms.SortingAlgorithm;

public class InsertionSort implements SortingAlgorithm
{

	@SuppressWarnings("unchecked")
	public <T extends Comparable> void sort(T array[])
	{
		for (int i = 1; i < array.length; i++)
		{
			T key = array[i];
			int j = i - 1;
			
			while (j >= 0 && key.compareTo(array[j]) < 0)
			{
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = key;
		}
	}

}
