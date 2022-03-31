from random import randint
import random
import time
def qsort(arr):
    qsortHelper(arr,0,len(arr)-1)

def qsortHelper(arr, left, right):
    if left >= right:
        return
    partPoint = partition(arr, left, right)
    qsortHelper(arr, left, partPoint-1)
    qsortHelper(arr, 1+partPoint, right)

def partition(arr, left, right):
    pivotIndex = randint(left, right)
    pivot = arr[pivotIndex]
    swap(arr, right, pivotIndex)
    pivotIndex = right
    right-=1
    while True:
        while arr[left]<pivot:
            left+=1
        while right>0 and arr[right]>pivot:
            right-=1
        if left >= right:
            print left, right, arr
            break
        else:
            swap(arr, left, right)
    swap(arr, pivotIndex, left)
    return left

def swap(arr,i,j):
     temp  = arr[i]
     arr[i] = arr[j]
     arr[j] = temp




arr=random.sample(range(10), 10)
start_time = time.time()
qsort(arr)
if sorted(arr) == arr:
    print "Array is sorted"
    print "Time taken to run",
    print("--- %s seconds ---" % (time.time() - start_time))

