def _best(array, key):
    best = 0
    for i, el in enumerate(array[1:]):
        if not key(el) > key(array[best]):
            best = i + 1

    return best


def sort(array, key=lambda x: x, reverse=False):
    '''Selection Sort is another classic sorting algorithm, slightly worse
    than Insertion Sort. It is also useful when auxiliary space is not
    available.

    The algorithm involves a first part of the array which is already sorted.
    Considering the first k elements are sorted, we pick the minimum / maximum
    from the rest of the elements and swap it with the element k + 1. We then
    continue with the sorted list of k + 1 elements.

    Running time: O(n ** 2).
    '''
    for i in range(len(array)):
        position = i + _best(array[i:], key)
        array[i], array[position] = array[position], array[i]

    return array[::-1] if reverse else array
