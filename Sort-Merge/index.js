"use strict";

function init() {
  // Just for encapsulation from other files
  // Dummy data
  console.time("merge");
  const arr1 = [1, 6, 2, 8, 3];
  const arr2 = [12, -1, 0, 3, 3];
  const arr3 = [-8, 6, 0, -1, 3, -10];
  const arr4 = [5];
  const arr5 = [];
  const arr6 = [6, 1, 2, 2, 2, 1, 5, -14];
  const arr7 = [10, 55, -5, 34, 7, 22, 19];

  const splitArr = (arrToSort) => {
    if (arrToSort.length < 2) return 0;
    // Find middle index of array
    let middleIdx = Math.floor(arrToSort.length / 2);
    // Divide array
    const leftArr = arrToSort.slice(0, middleIdx);
    const rightArr = arrToSort.slice(middleIdx);
    // console.log(`Left Arr: ${leftArr}, Right Array: ${rightArr}`);
    splitArr(leftArr);
    splitArr(rightArr);
    mergeArray(leftArr, rightArr, arrToSort);
  };

  const mergeArray = (left, right, result) => {
    let i = 0,
      j = 0,
      k = 0;
    // Copy small one to sorted array
    while (i < left.length && j < right.length) {
      if (left[i] < right[j]) {
        result[k++] = left[i++];
      } else {
        result[k++] = right[j++];
      }
    }
    // If one of the array's length is greater then second one, copy rest of the items to sorted arr
    while (i < left.length) {
      result[k++] = left[i++];
    }
    while (j < right.length) {
      result[k++] = right[j++];
    }
  };

  const mergeSort = (arr) => {
    console.log(`Before merge sorting: ${arr}`);
    splitArr(arr);
    console.log(` After merge sorting: ${arr}`);
  };

  mergeSort(arr1);
  mergeSort(arr2);
  mergeSort(arr3);
  mergeSort(arr4);
  mergeSort(arr5);
  mergeSort(arr6);
  mergeSort(arr7);
  console.timeEnd("merge");
}
init();
