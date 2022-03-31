"use strict";

function init() {
  // Dummy data
  const arr1 = [1, 6, 2, 8, 3];
  const arr2 = [12, -1, 0, 3, 3];
  const arr3 = [-8, 6, 0, -1, 3, -10];
  const arr4 = [5];
  const arr5 = [];
  const arr6 = [6, 1, 2, 2, 2, 1, 5, -14];

  const bubbleSort = (arr) => {
    console.log(`Before sorting: ${arr}`);

    for (let i = 0; i < arr.length; i++) {
      let swapCount = 0;
      for (let j = 1; j < arr.length - i; j++) {
        if (arr[j] < arr[j - 1]) {
          [arr[j - 1], arr[j]] = [arr[j], arr[j - 1]];
          swapCount++;
        }
      }
      if (swapCount === 0) break;
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
