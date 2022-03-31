def quicksort(aList):
        aList =  quicksort_start(aList, 0, len(aList)-1)

def quicksort_start(aList, low, high):
        if low < high:
                split_point = partition(aList, low, high)
                quicksort_start(aList, low, split_point-1)
                quicksort_start(aList, split_point+1, high)

def partition(aList, low, high):
        pivot_index = get_pivot(aList, low, high)
        pivot_value = aList[pivot_index]
        aList[pivot_index], aList[low] = aList[low], aList[pivot_index]
        border = low 

        for i in range(low, high+1):
                if aList[i] < pivot_value:
                        border+=1
                        aList[i], aList[border] = aList[border], aList[i]
        aList[low], aList[border] = aList[border], aList[low]

        return border

def get_pivot(aList, low, high):
        middle = (low+high)//2
        buildIn_sort = sorted([aList[low], aList[middle], aList[high]])
        if buildIn_sort[1] == aList[low]:
                return low
        elif buildIn_sort[1] == aList[middle]:
                return middle 
        return high


if __name__ == ("__main__"):
        aList = [12, 44, 6, 7, 19, 4, 10, 18]
        quicksort(aList)
        print(aList)