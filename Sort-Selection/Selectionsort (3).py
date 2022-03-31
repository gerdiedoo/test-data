class Selectionsort:
    def __init__(self):
        pass

    def selectionsort(self, unsortedArray):

        sizeOfArray = len(unsortedArray)

        for i in range(sizeOfArray):
            for j in range(i+1, sizeOfArray):

                if  unsortedArray[j] < unsortedArray[i]:
                    tempValue = unsortedArray[i]
                    unsortedArray[i] = unsortedArray[j]
                    unsortedArray[j] = tempValue

        return unsortedArray