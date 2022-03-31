def sort(array, key=lambda x: x, reverse=False):
    '''Insertion sort is a simple (and classic) sorting algorithm that is
    quite efficient for small array (think early 20s) and also O(n) in space.

    The algorithm keeps a sorted array at the beginning of the original array
    and inserts items in that section. Considering that the first k elements
    of the array are sorted, the algorithm takes element k + 1 and inserts it
    into the sorted array at the right position, etc.

    Running time: O(n^2).
    '''
    if len(array) <= 1:
        return array

    for i in range(len(array)):
        # while we're not in the right position, move on!
        while i > 0 and reverse == (key(array[i]) > key(array[i - 1])):
            array[i], array[i - 1] = array[i - 1], array[i]
            i = i - 1

    return array
