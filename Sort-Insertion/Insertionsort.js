
exports.insertsionSort = (unsortedArray) => {
    var length = unsortedArray.length,
        value, i, j;

    for (i = 0; i < length; i++){
        value = unsortedArray[i];

        for (j = i-1; j > -1 && unsortedArray[j] > value; j--) {
            unsortedArray[j+1] = unsortedArray[j];
        }
        unsortedArray[j+1] = value;
    }
    return unsortedArray;
}