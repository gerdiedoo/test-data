package com.bachelor;

import java.util.Arrays;

public class MergeSort {

    public int[] MergeSortInt (int[] array) {
        if (array.length < 2) {
            return array;
        }

        int middleIndex = (int)Math.floor(array.length / 2);
        int[] leftArray = Arrays.copyOfRange(array, 0, middleIndex);
        int[] rightArray = Arrays.copyOfRange(array, middleIndex, array.length);

        return MergeIntArray(MergeSortInt(leftArray), MergeSortInt(rightArray));
    }

    public char[] MergeSortChar (char[] array) {
        if (array.length < 2) {
            return array;
        }

        int middleIndex = (int)Math.floor(array.length / 2);
        char[] leftArray = Arrays.copyOfRange(array, 0, middleIndex);
        char[] rightArray = Arrays.copyOfRange(array, middleIndex, array.length);

        return MergeCharArray(MergeSortChar(leftArray), MergeSortChar(rightArray));
    }

    public float[] MergeSortFloat (float[] array) {
        if (array.length < 2) {
            return array;
        }

        int middleIndex = (int)Math.floor(array.length / 2);
        float[] leftArray = Arrays.copyOfRange(array, 0, middleIndex);
        float[] rightArray = Arrays.copyOfRange(array, middleIndex, array.length);

        return MergeFloatArray(MergeSortFloat(leftArray), MergeSortFloat(rightArray));
    }

    private int[] MergeIntArray (int[] leftArray, int[] rightArray) {
        int[] resultArray = new int[leftArray.length + rightArray.length];
        int resultIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                resultArray[resultIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                resultArray[resultIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        int[] leftRemains = Arrays.copyOfRange(leftArray, leftIndex, leftArray.length);
        int[] rightRemains = Arrays.copyOfRange(rightArray, rightIndex, rightArray.length);

        for (int i = 0; i < leftRemains.length; i++) {
            resultArray[resultIndex] = leftRemains[i];
            resultIndex++;
        }

        for (int i = 0; i < rightRemains.length; i++) {
            resultArray[resultIndex] = rightRemains[i];
            resultIndex++;
        }

        return resultArray;
    }

    private char[] MergeCharArray (char[] leftArray, char[] rightArray) {
        char[] resultArray = new char[leftArray.length + rightArray.length];
        int resultIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                resultArray[resultIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                resultArray[resultIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        char[] leftRemains = Arrays.copyOfRange(leftArray, leftIndex, leftArray.length);
        char[] rightRemains = Arrays.copyOfRange(rightArray, rightIndex, rightArray.length);

        for (int i = 0; i < leftRemains.length; i++) {
            resultArray[resultIndex] = leftRemains[i];
            resultIndex++;
        }

        for (int i = 0; i < rightRemains.length; i++) {
            resultArray[resultIndex] = rightRemains[i];
            resultIndex++;
        }

        return resultArray;
    }

    private float[] MergeFloatArray (float[] leftArray, float[] rightArray) {
        float[] resultArray = new float[leftArray.length + rightArray.length];
        int resultIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                resultArray[resultIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                resultArray[resultIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        float[] leftRemains = Arrays.copyOfRange(leftArray, leftIndex, leftArray.length);
        float[] rightRemains = Arrays.copyOfRange(rightArray, rightIndex, rightArray.length);

        for (int i = 0; i < leftRemains.length; i++) {
            resultArray[resultIndex] = leftRemains[i];
            resultIndex++;
        }

        for (int i = 0; i < rightRemains.length; i++) {
            resultArray[resultIndex] = rightRemains[i];
            resultIndex++;
        }

        return resultArray;
    }
}
