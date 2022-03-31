// Time complexity is O(n).
package com.javaqubes.com;

public class LinearSearch {
	public static void main(String[] args) {
		// Array data set
		int[] data = {0,4,7,12,32,44,56,77,89,102,155};
		
		// searching item
		int searchItem = 56;
		int result  = LinearSearch.search(data,searchItem,data.length);
		if(result == -1)
			System.out.println("Data Not Found");
		else
			System.out.println("Data Found at index : " + result);
	}
	
	// searching data linearly if found return index otherwise return -1.
	// search(Array , item to be search , max size of array) 
	public static int search(int[] data, int searchItem, int end) {
		for (int i = 0; i < end; i++) {
			if(searchItem == data[i])
				return i;
		}
		return -1;
	}
}

