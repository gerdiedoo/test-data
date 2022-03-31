
def partition(array, pivotValue):
	lefthalf = []
	righthalf = [] 

	for elem in array:
		if elem <= pivotValue:
			lefthalf.append(elem)
		elif elem > pivotValue:		
			righthalf.append(elem) 

	return (lefthalf, righthalf) 


def quicksort(array):
	if len(array) == 1 or len(array) == 0:
		return array
	elif len(array) >= 2: 
		pivot = array.pop() #last element of array
		lefthalf, righthalf = partition(array, pivot)
		return quicksort(lefthalf) + [pivot] + quicksort(righthalf)

if __name__ == '__main__':
	# print quicksort([10,3,1,0,2])
	# lefthalf, righthalf, indexOfPivot =  partition([1,5,3,2],2)
	print quicksort([5,1,5,150,0,-10])
	# print partition([0,1],1)