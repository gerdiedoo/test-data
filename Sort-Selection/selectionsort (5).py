"""
Select the next smallest element
"""
import random


def swap(array, firstIndex, secondIndex):
    tempArr = array[:]  # making a copy
    tempArr[firstIndex], tempArr[secondIndex] = array[secondIndex], array[firstIndex]
    return tempArr


def indexOfMinimum(array, startIndex):
    minValue = array[startIndex]
    minIndex = startIndex 

    for i in range(startIndex + 1, len(array)):
		if array[i] < minValue:
			minValue = array[i]
			minIndex = i
			
    return minIndex


def selectionSort(array):
	arr = array[:]
	for i in range(len(array)):
		arr = swap(arr, i, indexOfMinimum(arr, i))
	return arr


if __name__ == '__main__':
	a, b = random.randint(0, 9), random.randint(0, 9)
	# print swap(range(10),a,b), a, b
	# print indexOfMinimum([493,3,5,2,25],0)
	print selectionSort([1, 5, 4, 2, 4, 493, 3, 2, 25])
