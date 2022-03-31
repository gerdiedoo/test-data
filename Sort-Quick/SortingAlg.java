import java.util.Random;

public class SortingAlg {
    public int[] mergeSort(int[] array) {
        if (array.length > 1) {
            int[] leftArray = new int[array.length / 2];
            int[] rightArray = new int[array.length - array.length / 2];
            for (int i = 0; i < leftArray.length; i++) {
                leftArray[i] = array[i];
            }
            for (int i = 0; i < rightArray.length; i++) {
                rightArray[i] = array[i + (array.length / 2)];
            }
            rightArray = mergeSort(rightArray);
            leftArray = mergeSort(leftArray);
            return merge(leftArray, rightArray);
        } else
            return array;
    }

    private int[] merge(int[] leftArray, int[] rightArray) {
        int[] tempArray = new int[leftArray.length + rightArray.length];
        int inxLeft = 0;
        int inxRight = 0;
        int i = 0;
        while (i < tempArray.length) {
            if (inxLeft == leftArray.length) {
                tempArray[i] = rightArray[inxRight];
                inxRight++;
            } else if (inxRight == rightArray.length) {
                tempArray[i] = leftArray[inxLeft];
                inxLeft++;
            } else if (leftArray[inxLeft] > rightArray[inxRight]) {
                tempArray[i] = rightArray[inxRight];
                inxRight++;
            } else {
                tempArray[i] = leftArray[inxLeft];
                inxLeft++;
            }
            i++;
        }
        return tempArray;
    }

    public int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tempVal = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > tempVal) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tempVal;
        }
        return array;
    }

    public int[] shellSort(int[] array, int distance) {
        while (distance > 0) {
            for (int i = array.length - distance - 1; i >= 0; i--) {
                int tempVal = array[i];
                int j = i + distance;
                while ((j < array.length) && (tempVal > array[j])) {
                    array[j - distance] = array[j];
                    j += distance;
                }
                array[j - distance] = tempVal;
            }
            distance /= 2;
        }
        return array;
    }

    public int[] quickSort(int[] array) {
        return quickSort(array, 0, array.length - 1);
    }

    private int[] quickSort(int[] array, int begin, int end) {
        if (begin < end) {
            int inx = divArray(array, begin, end);
            if(inx == 0 || inx == array.length)
                return array;

            quickSort(array, begin, inx - 1);
            quickSort(array, inx + 1, end);
        }
        return array;
    }

    private int divArray(int[] array, int begin, int end) {
        int tempVal;
        Random r = new Random();
        int rInx = r.nextInt(end - begin) + begin;

        tempVal = array[end];
        array[end] = array[rInx];
        array[rInx] = tempVal;

        long pivot = array[end];
        int flag = begin - 1;

        for (int i = begin ; i <= end - 1; i++) {
            if (array[i] <= pivot) {
                flag++;
                tempVal = array[flag];
                array[flag] = array[i];
                array[i] = tempVal;
            }
        }

        tempVal = array[flag + 1];
        array[flag + 1] = array[end];
        array[end] = tempVal;

        return (flag + 1);
    }
}
