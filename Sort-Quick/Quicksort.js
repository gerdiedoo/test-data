
exports.quickSort = function (unsortedArray, leftIndex, rightIndex) {
    var index;

    if (unsortedArray.length > 1) {
        index = partition(unsortedArray, leftIndex, rightIndex);

        if (leftIndex < index - 1) {
            this.quickSort(unsortedArray, leftIndex, index - 1);
        }
        if (index < rightIndex) {
            this.quickSort(unsortedArray, index, rightIndex);
        }
    }
    return unsortedArray;
}

function partition(array, left, right) {
    var pivot = array[Math.floor((left+right) / 2)];

    while (left <= right) {
        while (pivot > array[left]) {
            left++;
        }
        while (pivot < array[right]) {
            right--;
        }

        if (left <= right) {
            var tempValue = array[left];
            array[left] = array[right];
            array[right] = tempValue;
            left++;
            right--;
        }
    }
    return left;
}