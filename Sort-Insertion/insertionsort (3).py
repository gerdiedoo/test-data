def insertionsort_method1(aList):
        """
        This is a Insertion Sort algorithm
        :param n: size of the list 
        :param temp: temporarily stores value in the list to swap later on
        :param aList: An unsorted list
        :return: A sorted ist
        :precondition: An unsorted list
        :Complexity: Best Case is O(N), Worst Case is O(N^2) because this algorithm is able to exit the while loop early if it nearly sorted, insertion sort starts sorting from the beginning towards
        the end, so if one of the value in the list is bigger than the temporary value, it can exit early (assuming this is a true insertion sort algorithm). The worst case happens when the algorithm
        is sorted in reverse, the entire list will compare and swap.
        :Stability: Insertion sort is a stable sorting algorithm because the algorithm only swaps the compared value with the value before it and will not swap the position of similar value, making
        it unable to break the relative order.
        """
        n = len(aList)

        for i in range(1, n):
                temp = aList[i]
                k = i - 1
                while(k >= 0 and aList[k] > temp):
                        aList[k+1] = aList[k]
                        k-=1
                        aList[k+1] = temp

def insertionsort_method2(aList):
        n = len(aList)

        for i in range(1, n):
                k = i-1
                while k >= 0 and aList[k] > aList[k+1]:
                        aList[k] , aList[k+1] = aList[k+1] , aList[k]
                        k-=1


if __name__ == ("__main__"):
        list1 = [12, 44, 6, 7, 19, 4, 10, 18]
        list2 = [12, 44, 6, 7, 19, 4, 10, 18]
        insertionsort_method1(list1)
        insertionsort_method2(list2)
        print("Method 1: ", list1)
        print("Method 2: ", list2)