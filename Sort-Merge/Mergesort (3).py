class Mergesort:
    def __init__(self):
        pass

    def mergesort(self, unsortedArray):
        if len(unsortedArray) == 1:
            return unsortedArray

        middleIndex = int(len(unsortedArray)/2)

        leftArray = unsortedArray[:middleIndex]
        rightArray = unsortedArray[middleIndex:]

        half_left = self.mergesort(leftArray)
        half_right = self.mergesort(rightArray)

        return self.merge(half_left, half_right)

    def merge(self, leftArray, rightArray):
        leftIndex = 0
        rightIndex = 0
        resultArray = []

        while leftIndex < len(leftArray) and rightIndex < len(rightArray):
            if leftArray[leftIndex] < rightArray[rightIndex]:
                resultArray.append(leftArray[leftIndex])
                leftIndex += 1
            else:
                resultArray.append(rightArray[rightIndex])
                rightIndex += 1

        while leftIndex < len(leftArray):
            resultArray.append(leftArray[leftIndex])
            leftIndex += 1

        while rightIndex < len(rightArray):
            resultArray.append(rightArray[rightIndex])
            rightIndex += 1

        return resultArray