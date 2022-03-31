
exports.mergeSort = function (unsortedArray) {
    if (unsortedArray.length < 2) {
        return unsortedArray;
    }

    var middleIndex =  Math.floor((unsortedArray.length) / 2),
    leftArray = unsortedArray.slice(0, middleIndex),
    rightArray = unsortedArray.slice(middleIndex);

    return merge(this.mergeSort(leftArray), this.mergeSort(rightArray));
}

function merge(leftArray, rightArray) {
    var resultArray = [], leftIndex = 0, rightIndex = 0;

    while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
        if (leftArray[leftIndex] < rightArray[rightIndex]) {
            resultArray.push(leftArray[leftIndex]);
            leftIndex++;
        } else {
            resultArray.push(rightArray[rightIndex]);
            rightIndex++;
        }
    }

    var leftRemains = leftArray.slice(leftIndex),
        rightRemains = rightArray.slice(rightIndex);

    return resultArray.concat(leftRemains).concat(rightRemains);
}