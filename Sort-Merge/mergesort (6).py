# divide and conquer

def merge(array_one, array_two):
    lowhalf = array_one[:]
    highhalf = array_two[:]
    
    merged_array = []

    while( len(lowhalf) > 0 or len(highhalf) > 0):
        if len(lowhalf) == 0 and len(highhalf) > 0:
            merged_array.append(highhalf.pop(0))
        elif len(highhalf) == 0 and len(lowhalf) > 0:
            merged_array.append(lowhalf.pop(0)) 
        elif lowhalf[0] <= highhalf[0]:
            merged_array.append(lowhalf.pop(0))
            # print lowhalf, highhalf
        elif lowhalf[0] > highhalf[0]:
            merged_array.append(highhalf.pop(0))
            # print lowhalf, highhalf
        else:
            raise ValueError("Merge function didn't compare properly")
    
    return merged_array

def mergesort(arr):
    if len(arr) == 1:
        return arr
    elif len(arr) == 2:
        if arr[0] <= arr[1]:
            return arr
        elif arr[0] >= arr[1]:
            return [arr[1], arr[0]]
        else:
            raise ValueError("Unexpected problem with 2 element comparison")
    else: 
        arr1 = mergesort(arr[0:len(arr)/2])
        arr2 = mergesort(arr[len(arr)/2:])
        return merge(arr1, arr2)   
             
if __name__ == '__main__':
    print merge([1,2,5],[4,6,8])
    print mergesort([5,1,36,4])

