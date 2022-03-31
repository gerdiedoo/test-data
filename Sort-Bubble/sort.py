import datetime
import sys
from math import ceil


def measure_time(func):
    def wrapper(*args, **kwargs):
        t1 = datetime.datetime.now()
        func(*args, **kwargs)
        delta = datetime.datetime.now() - t1
        print('%s\t\t%s' % (func.__name__, delta))
    return wrapper


@measure_time
def bubbleSort(arr):
    did_swap = True
    n = len(arr)

    while did_swap:
        did_swap = False
        for i in range(n-1):
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
                did_swap = True

        n = n-1


@measure_time
def selectionSort(arr):
    for i in range(len(arr)-1):
        idx = i

        for j in range(i+1, len(arr)):
            if arr[j] < arr[idx]:
                idx = j

        if idx != i:
            arr[i], arr[idx] = arr[idx], arr[i]


@measure_time
def insertionSort(arr):
    for i in range(len(arr)):
        j = i
        while j > 0 and arr[j-1] > arr[j]:
            arr[j], arr[j-1] = arr[j-1], arr[j]
            j -= 1 


@measure_time
def shellSort(arr):
    n = len(arr)
    gap = int(n/2)

    while gap > 0:
        for i in range(gap, n):
            tmp = arr[i]

            j = i
            while j >= gap and arr[j-gap] > tmp:
                arr[j] = arr[j-gap]
                j -= gap

            arr[j] = tmp

        gap = int(gap/2)


@measure_time
def combSort(arr):
    gap = len(arr)
    shrink = 1.3
    is_sorted = False

    while not is_sorted:
        gap = int(gap / shrink)

        if gap > 1:
            is_sorted = False
        else:
            gap = 1
            is_sorted = True

        i = 0
        while i + gap < len(arr):
            if arr[i] > arr[i+gap]:
                arr[i], arr[i+gap] = arr[i+gap], arr[i]
                is_sorted = False

            i += 1


@measure_time
def mergeSort(arr):
    def sort(arr, left, right):
        if left < right:
            if right - left <= 1:
                return
            mid = ceil((left + right) / 2)

            sort(arr, left, mid)
            sort(arr, mid, right)
            merge(arr, left, mid, right)

    def merge(arr, left, mid, right):
        L = arr[left:mid]
        R = arr[mid:right]

        i = 0
        j = 0
        k = left

        while i < len(L) and j < len(R):
            if L[i] <= R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1

        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1

        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1

    sort(arr, 0, len(arr))


@measure_time
def heapSort(arr):
    def heapify(arr, idx, n):
        largest = idx

        left = 2 * idx + 1
        right = 2 * idx + 2

        if left < n and arr[largest] < arr[left]:
            largest = left

        if right < n and arr[largest] < arr[right]:
            largest = right

        if largest != idx:
            arr[idx], arr[largest] = arr[largest], arr[idx]

            heapify(arr, largest, n)

    n = len(arr)
    for i in range(n, -1, -1):
        heapify(arr, i, n)

    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        heapify(arr, 0, i)


@measure_time
def quickSortLomuto(arr):
    def sort(arr, lo, hi):
        if lo < hi:
            p = partition(arr, lo, hi)
            sort(arr, lo, p-1)
            sort(arr, p+1, hi)

    def partition(arr, lo, hi):
        pivot = arr[hi]
        i = lo
        for j in range(lo, hi):
            if arr[j] < pivot:
                arr[i], arr[j] = arr[j], arr[i]
                i += 1

        arr[i], arr[hi] = arr[hi], arr[i]
        return i

    sort(arr, 0, len(arr)-1)


@measure_time
def quickSortHoare(arr):
    def sort(arr, lo, hi):
        if lo < hi:
            p = partition(arr, lo, hi)
            sort(arr, lo, p)
            sort(arr, p+1, hi)

    def partition(arr, lo, hi):
        pivot = arr[lo]
        i = lo - 1
        j = hi + 1
        while True:
            while True:
                i += 1
                if not (arr[i] < pivot):
                    break

            while True:
                j -= 1
                if not (arr[j] > pivot):
                    break

            if i >= j:
                return j

            arr[i], arr[j] = arr[j], arr[i]

    sort(arr, 0, len(arr)-1)


SORTS = {
    'bubble': bubbleSort,
    'selection': selectionSort,
    'insertion': insertionSort,
    'shell': shellSort,
    'comb': combSort,
    'merge': mergeSort,
    'heap': heapSort,
    'quick_lomuto': quickSortLomuto,
    'quick_hoare': quickSortHoare,
}


def main():
    arr = []
    with open('rand.txt', 'r') as infile:
        for line in infile:
            arr.append(int(line))

    SORTS[sys.argv[1]](arr)


if __name__ == '__main__':
    main()
