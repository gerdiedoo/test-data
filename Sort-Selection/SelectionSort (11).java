package com.bachelor;

public class SelectionSort {

    public int[] selectionSortInt (int[] unsortedArray){
        for (int i = 0; i < unsortedArray.length; i++) {
            int lowestValueIndex = i;
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[lowestValueIndex]){
                    lowestValueIndex = j;
                }
            }

            if (lowestValueIndex != i) {
                int temp = unsortedArray[i];
                unsortedArray[i] = unsortedArray[lowestValueIndex];
                unsortedArray[lowestValueIndex] = temp;
            }
        }
        return unsortedArray;
    }

    public char[] selectionSortChar (char[] unsortedArray){
        for (int i = 0; i < unsortedArray.length; i++) {
            int lowestValueIndex = i;
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[lowestValueIndex]){
                    lowestValueIndex = j;
                }
            }

            if (lowestValueIndex != i) {
                char temp = unsortedArray[i];
                unsortedArray[i] = unsortedArray[lowestValueIndex];
                unsortedArray[lowestValueIndex] = temp;
            }
        }
        return unsortedArray;
    }

    public float[] selectionSortFloat (float[] unsortedArray){
        for (int i = 0; i < unsortedArray.length; i++) {
            int lowestValueIndex = i;
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[lowestValueIndex]){
                    lowestValueIndex = j;
                }
            }

            if (lowestValueIndex != i) {
                float temp = unsortedArray[i];
                unsortedArray[i] = unsortedArray[lowestValueIndex];
                unsortedArray[lowestValueIndex] = temp;
            }
        }
        return unsortedArray;
    }
}
