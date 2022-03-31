
exports.selectionSort = (unsortedArray) => {
    var length = unsortedArray.length, min;

    for (var i = 0; i < length; i++) {
        min = i;

        for (var j = i+1; j < length; j++){
            if (unsortedArray[j] < unsortedArray[min]) {
                min = j;
            }
        }

        if (i != min) {
            var tempValue = unsortedArray[i];
            unsortedArray[i] = unsortedArray[min];
            unsortedArray[min] = tempValue;
        }
    }
    return unsortedArray;
}