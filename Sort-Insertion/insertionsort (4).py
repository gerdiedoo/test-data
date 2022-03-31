import time
import random
def insertionSortI(arr):
    length = len(arr)
    for i in range(1,length):
        j = i
        while j>0 and arr[j-1]>arr[j]:
            swap(arr, j, j-1)
            j-=1


def insertionSortR(arr,start,end):
    length = end-start
    if length > 1:
        insertionSortR(arr,start,end-1)
        j=end-1
        while j>0 and arr[j-1]>arr[j]:
            swap(arr, j, j-1)
            j-=1
def swap(arr,i,j):
    temp  = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
arr=  random.sample(range(1000), 1000)
start_time = time.time()
insertionSortI(arr)
if sorted(arr) == arr:
     print "Array is sorted"
     print "Time taken to run",
     print("--- %s seconds ---" % (time.time() - start_time))

