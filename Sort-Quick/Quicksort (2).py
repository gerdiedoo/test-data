class Quicksort:
    def __init__(self):
        pass

    def partition(self, unsortedArray, leftPosition, rightPosition):
        pivot = unsortedArray[leftPosition]
        pivotIndex = leftPosition
        indexOfLastItem = rightPosition

        lessThanPivotIndex = indexOfLastItem
        greaterThanPivotIndex = leftPosition+1

        while True:
            while unsortedArray[greaterThanPivotIndex] < pivot and greaterThanPivotIndex < rightPosition:
                greaterThanPivotIndex += 1

            while unsortedArray[lessThanPivotIndex] > pivot and lessThanPivotIndex >= leftPosition:
                lessThanPivotIndex -= 1

            if greaterThanPivotIndex < lessThanPivotIndex:
                temp = unsortedArray[greaterThanPivotIndex]
                unsortedArray[greaterThanPivotIndex] = unsortedArray[lessThanPivotIndex]
                unsortedArray[lessThanPivotIndex] = temp
                greaterThanPivotIndex += 1
                lessThanPivotIndex -= 1
            else:
                break

        unsortedArray[pivotIndex] = unsortedArray[lessThanPivotIndex]
        unsortedArray[lessThanPivotIndex] = pivot
        return lessThanPivotIndex

    # Does not return a array, it still works just use the same array that was sent into the sorting method and it
    # should be sorted.
    def quicksort(self, unsortedArray, leftPosition, rightPosition):
        if rightPosition - leftPosition <= 0:
            return

        else:
            partitionPoint = self.partition(unsortedArray, leftPosition, rightPosition)
            self.quicksort(unsortedArray, leftPosition, partitionPoint-1)
            self.quicksort(unsortedArray, partitionPoint+1, rightPosition)