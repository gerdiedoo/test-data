package hr.sortingalgorithms;

import hr.sortingalgorithms.SortingAlgorithm;

public class SelectionSort implements SortingAlgorithm
{

	@SuppressWarnings("unchecked")
	public <T extends Comparable> void sort(T array[])
	{
		for (int i = 0; i < array.length - 1; i++)
		{
			T minimumValue = array[i];
			int minimumIndex = i;

			for (int j = i + 1; j < array.length; j++)
			{
				if (array[j].compareTo(minimumValue) < 0)
				{
					minimumValue = array[j];
					minimumIndex = j;
				}
			}

			T temp = array[i];
			array[i] = array[minimumIndex];
			array[minimumIndex] = temp;
		}
	}

}
