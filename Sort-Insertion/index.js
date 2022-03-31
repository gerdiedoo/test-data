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

  const insertionSort = (arr) => {
    console.log(`Before sorting: ${arr}`);
    for (let index = 1; index < arr.length; index++) {
      // 1. Keep current index and value as temp
      const current = arr[index];
      let prevIndex = index - 1;
      // 2. Swap until left element is smaller then current
      while (prevIndex >= 0 && arr[prevIndex] > current) {
        [arr[prevIndex + 1], arr[prevIndex]] = [arr[prevIndex], current];
        prevIndex--;
      }
    }
    console.log(` After sorting: ${arr}`);
  };

  insertionSort(arr1);
  insertionSort(arr2);
  insertionSort(arr3);
  insertionSort(arr4);
  insertionSort(arr5);
  insertionSort(arr6);
}
init();
