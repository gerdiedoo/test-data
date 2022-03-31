def _merge(left, right, key):
    result = []
    while left and right:
        if key(left[0]) > key(right[0]):
            result.append(right.pop(0))
        else:
            result.append(left.pop(0))
    result.extend(left)
    result.extend(right)

    return result


def _recsort(array, key):
    if len(array) <= 1:
        return array

    middle = len(array) // 2
    left = _recsort(array[:middle], key)
    right = _recsort(array[middle:], key)

    return _merge(left, right, key)


def sort(array, key=lambda x: x, reverse=False):
    '''Merge sort is a divide and conquer algorithm.

    The algorithm is very similar to that of Quicksort and other divide and
    conquer algorithms. It first divides the list in two halves, then it
    calls Mergesort on the two halves and at the end it merges them into a
    sorted array.

    Running time: O(n * lgn).
    '''
    array = _recsort(array, key)
    return array[::-1] if reverse else array
