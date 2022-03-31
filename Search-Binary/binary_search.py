"""
Input : A sorted sequence of number (a1, a2,.... an) and the target value that has to be searched

Output : the index of the target value

Time complexity : O(log n)
"""

def binary_search(A, t):
    A.sort() //if arrary is not sorted
    low = 0
    high = len(A) - 1
    while low <= high:
        mid = (low + high) / 2
        if A[mid] == t:
            return 'found at :' + mid
        elif A[mid] > t:
            high = mid - 1
        else :
            low = mid + 1

    return False
