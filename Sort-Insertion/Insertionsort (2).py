class Insertionsort:
    def __init__(self):
        pass

    def insertionsort(self, unsortedArray):
        for index in range(len(unsortedArray)):
            position = index
            tempValue = unsortedArray[index]

            while position > 0 and unsortedArray[position - 1] > tempValue:
                unsortedArray[position] = unsortedArray[position - 1]
                position -= 1

            unsortedArray[position] = tempValue

        return unsortedArray