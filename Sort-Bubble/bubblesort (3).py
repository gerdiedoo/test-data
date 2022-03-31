def bubbleSort(aList):
        for i in range(0, len(aList)-1):
                for j in range(0, len(aList) - i -1):
                        if aList[j] > aList[j+1]:
                                aList[j], aList[j+1] = aList[j+1], aList[j]



if __name__ == ("__main__"):
        aList = [12, 44, 6, 7, 19, 4, 10, 18]
        bubbleSort(aList)
        print(aList)
