def sort(array, key=lambda x: x, reverse=False):
    '''Bubble sort is a simple sorting algorithm that works by repeatedly
    stepping through the list to be sorted, comparing each pair of adjacent
    items and swapping them if they are in the wrong order.

    Running time: O(n ** 2).
    '''
    if len(array) <= 1:
        return array

    while True:
        swapped = False
        for i in range(len(array) - 1):
            if reverse == (key(array[i]) <= key(array[i + 1])):
                array[i], array[i + 1] = array[i + 1], array[i]
                swapped = True

        if not swapped:
            break

    return array
