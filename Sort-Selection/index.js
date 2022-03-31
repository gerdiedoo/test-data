"use strict";

function init() {
  // Just for encapsulation from other files
  // Dummy data
  const arr1 = [1, 6, 2, 8, 3];
  const arr2 = [12, -1, 0, 3, 3];
  const arr3 = [-8, 6, 0, -1, 3, -10];
  const arr4 = [5];
  const arr5 = [];
  const arr6 = [6, 1, 2, 2, 2, 1, 5, -14];

  // Tricky function to get actual index of min value after slice
  const findMinIndex = (arr, sliceIdx) => {
    let sliceMinIndex = arr
      .slice(sliceIdx)
      .indexOf(Math.min(...arr.slice(sliceIdx)));
    return sliceMinIndex + sliceIdx;
  };

  const selectionSort = (arr) => {
    console.log(`Before sorting: ${arr}`);
    for (let index = 0; index < arr.length; index++) {
      const temp = arr[index];
      const minIndex = findMinIndex(arr, index);
      // Swap
      [arr[index], arr[minIndex]] = [arr[minIndex], temp];
    }
    console.log(` After sorting: ${arr}`);
  };

  selectionSort(arr1);
  selectionSort(arr2);
  selectionSort(arr3);
  selectionSort(arr4);
  selectionSort(arr5);
  selectionSort(arr6);
}
init();
