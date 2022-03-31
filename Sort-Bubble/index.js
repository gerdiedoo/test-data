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
  // Swap elements in array if left side is greater than right
  const swap = (arr, index, swapCount) => {
    const current = arr[index];
    const next = arr[index + 1];
    if (next != undefined && current > next) {
      [arr[index], arr[index + 1]] = [next, current];
      ++swapCount;
    }
    return swapCount;
  };

  const bubbleSort = (arr) => {
    console.log(`Before sorting: ${arr}`);
    while (true) {
      let swapCount = 0;
      arr.forEach((item, index) => {
        // debugger;
        // If array fully sorted, then swap count should be 0 in full iteration
        swapCount = swap(arr, index, swapCount);
      });
      // console.log(` Swap count in full array iteration is: ${swapCount}`);
      // If swap count is 0 then array is sorted, stop operation
      if (!swapCount) break;
    }
    console.log(` After sorting: ${arr}`);
  };

  bubbleSort(arr1);
  bubbleSort(arr2);
  bubbleSort(arr3);
  bubbleSort(arr4);
  bubbleSort(arr5);
  bubbleSort(arr6);
}
init();
