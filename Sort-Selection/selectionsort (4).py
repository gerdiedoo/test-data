def selectionsort(aList):
        """
        This is a Sorting Algorithm
        :param n: size of the list 
        :param min_position: the position with minimum(smallest) value to swap
        :param aList: An unsorted list
        :return: A sorted ist
        :precondition: An unsorted list
        :Complexity: Best Case is O(N^2), Worst Case is O(N^2) because selection sort involves comparison of the whole list, it does not have any condition that exits the for loop early. 
        :Stability: Selection sort is not a stable sorting algorithm, it changes the relative order of the list. For example, if the unsorted list is [6,6,2,3], on the first iteration, list[0] (the value 6)
        will be swapped with the lowest value (the value 2) in the list after the comparing number(list[0]). In this case, the algorithm will skip list[1] which is also 6 as it is equal list[0], changing 
        the relative order of the list.
        """
        n = len(aList)

        for i in range(n-1):
                min_position = i
                for j in range(i+1, n):
                        if aList[min_position] > aList[j]:
                                min_position = j
                aList[i], aList[min_position] = aList[min_position], aList[i]


if __name__ == ("__main__"):
        aList = [12, 44, 6, 7, 19, 4, 10, 18]
        selectionsort(aList)
        print(aList)
        
