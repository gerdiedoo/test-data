def mergesort(aList):
        mergesort_start(aList, 0, len(aList)-1)

def mergesort_start(aList, first, last):
        if first < last:
                middle = (first + last)//2
                mergesort_start(aList, first, middle)
                mergesort_start(aList, middle+1, last)
                mergeList(aList, first, middle, last)

def mergeList(aList, first, middle, last):
        L = aList[first:middle+1]
        R = aList[middle+1: last+1]
        L.append(9999999999)#Append a large value so that when compared,
        R.append(9999999999)#it will always get the value of list from the other side
        i = j = 0

        for k in range(first, last+1):
                if L[i] <= R[j]:
                        aList[k] = L[i]
                        i+=1
                else:
                        aList[k] = R[j]
                        j+=1
        print("Left:",L)
        print("Right:",R)

if __name__ == ("__main__"):
        aList = [12, 44, 6, 7, 19, 4, 10, 18]
        mergesort(aList)
        print(aList)