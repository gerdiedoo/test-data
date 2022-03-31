import random
import time

def mergesort(arr,start,end):
    if start<end:
        midpoint = start+(end-start)/2
        mergesort(arr, start,midpoint)
        mergesort(arr,midpoint+1,end)
        merge(arr, start,midpoint,midpoint+1,end)

def merge(arr, start1,end1,start2,end2):
    copy(arr,helper,start1,end2)
    i=start1
    while start2<=end2 and start1<=end1:
        if helper[start1] <= helper[start2]:
            arr[i] = helper[start1]
            start1+=1
        else:
            arr[i] = helper[start2]
            start2+=1
        i+=1
    while start1<=end1:
        arr[i] = helper[start1]
        i, start1=i+1,start1+1

def copy(source, target, start, end):
    while start<=end:
        target[start] = source[start]
        start +=1



arr=random.sample(range(1000), 1000)  
helper = [0]*len(arr)
start_time = time.time()
mergesort(arr,0,len(arr)-1)
if sorted(arr) == arr:
    print "Array is sorted"
    print "Time taken to run",
    print("--- %s seconds ---" % (time.time() - start_time))

    
