package com.bachelor;

public class InsertionSort {
    public int[] insertionSortInt(int[] unsortedArray) {
        for (int index = 0; index < unsortedArray.length; index++){
            int position = index;
            int temp_value = unsortedArray[index];

            while(position > 0 && unsortedArray[position - 1] > temp_value) {
                unsortedArray[position] = unsortedArray[position - 1];
                position--;
            }
            unsortedArray[position] = temp_value;
        }
        return unsortedArray;
    }

    //TODO: Sorting issue. More info on Gitlab.
    public char[] insertionSortChar(char[] unsortedArray) {
        for (int index = 0; index < unsortedArray.length; index++){
            int position = index;
            char temp_value = unsortedArray[index];

            while(position > 0 && unsortedArray[position - 1] > temp_value) {
                unsortedArray[position] = unsortedArray[position - 1];
                position--;
            }
            unsortedArray[position] = temp_value;
        }
        return unsortedArray;
    }
    //TODO: Sorting issue. More info on Gitlab.
    public float[] insertionSortFloat(float[] unsortedArray) {
        for (int index = 0; index < unsortedArray.length; index++){
            int position = index;
            float temp_value = unsortedArray[index];

            while(position > 0 && unsortedArray[position - 1] > temp_value) {
                unsortedArray[position] = unsortedArray[position - 1];
                position--;
            }
            unsortedArray[position] = temp_value;
        }
        return unsortedArray;
    }

}
