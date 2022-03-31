package com.bachelor;

public class QuickSort {

    private int[] intArray;
    private char[] charArray;
    private float[] floatArray;

    //Starts the quicksorting process.
    public int[] startQuickSortInt (int[] unsortedArray) {
        this.intArray = unsortedArray;
        quickSortInt(0, this.intArray.length - 1);
        return this.intArray;
    }

    public char[] startQuickSortChar (char[] unsortedArray) {
        this.charArray = unsortedArray;
        quickSortChar(0, this.charArray.length - 1);
        return this.charArray;
    }

    public float[] startQuickSortFloat (float[] unsortedArray) {
        this.floatArray = unsortedArray;
        quickSortFloat(0, this.floatArray.length - 1);
        return this.floatArray;
    }

    private void swapInt (int position1, int position2) {
        int temp = this.intArray[position2];
        this.intArray[position2] = this.intArray[position1];
        this.intArray[position1] = temp;
    }

    private void swapChar (int position1, int position2) {
        char temp = this.charArray[position2];
        this.charArray[position2] = this.charArray[position1];
        this.charArray[position1] = temp;
    }

    private void swapFloat (int position1, int position2) {
        float temp = this.floatArray[position2];
        this.floatArray[position2] = this.floatArray[position1];
        this.floatArray[position1] = temp;
    }

    private void quickSortInt (int left_pointer, int right_pointer) {
        int index = 0;
        int left_index = left_pointer;
        int right_index = right_pointer;

        if (this.intArray.length > 1) {
            int pivot = this.intArray[(int)Math.floor((left_index+right_index) / 2)];

            while (left_pointer <= right_pointer) {
                while (pivot > this.intArray[left_pointer]) {
                    left_pointer++;
                }

                while (pivot < this.intArray[right_pointer]) {
                    right_pointer--;
                }

                if (left_pointer <= right_pointer) {
                    swapInt(left_pointer, right_pointer);
                    left_pointer++;
                    right_pointer--;
                }
            }
            index = left_pointer;

            if (left_index < index - 1) {
                quickSortInt(left_index, index - 1);
            }

            if (index < right_index) {
                quickSortInt(index, right_index);
            }
        }
    }

    private void quickSortChar (int left_pointer, int right_pointer) {
        int index = 0;
        int left_index = left_pointer;
        int right_index = right_pointer;

        if (this.charArray.length > 1) {
            char pivot = this.charArray[(int)Math.floor((left_index+right_index) / 2)];

            while (left_pointer <= right_pointer) {
                while (pivot > this.charArray[left_pointer]) {
                    left_pointer++;
                }

                while (pivot < this.charArray[right_pointer]) {
                    right_pointer--;
                }

                if (left_pointer <= right_pointer) {
                    swapChar(left_pointer, right_pointer);
                    left_pointer++;
                    right_pointer--;
                }
            }
            index = left_pointer;

            if (left_index < index - 1) {
                quickSortChar(left_index, index - 1);
            }

            if (index < right_index) {
                quickSortChar(index, right_index);
            }
        }
    }

    private void quickSortFloat (int left_pointer, int right_pointer) {
        int index = 0;
        int left_index = left_pointer;
        int right_index = right_pointer;

        if (this.floatArray.length > 1) {
            float pivot = this.floatArray[(int)Math.floor((left_index+right_index) / 2)];

            while (left_pointer <= right_pointer) {
                while (pivot > this.floatArray[left_pointer]) {
                    left_pointer++;
                }

                while (pivot < this.floatArray[right_pointer]) {
                    right_pointer--;
                }

                if (left_pointer <= right_pointer) {
                    swapFloat(left_pointer, right_pointer);
                    left_pointer++;
                    right_pointer--;
                }
            }
            index = left_pointer;

            if (left_index < index - 1) {
                quickSortFloat(left_index, index - 1);
            }

            if (index < right_index) {
                quickSortFloat(index, right_index);
            }
        }
    }
}
