import random


def _recsort(array, key):
    if len(array) <= 1:
        return array

    pivot = random.randrange(len(array))
    element = array.pop(pivot)

    left = _recsort([x for x in array if not key(x) > key(element)], key)
    right = _recsort([x for x in array if key(x) > key(element)], key)

    return left + [element] + right


def sort(array, key=lambda x: x, reverse=False):
    '''Quicksort is a sorting algorithm based on a partitioning-exchange
    mechanism, one can even say it's a divide and conquer algorithm (divide
    et impera even).

    The algorithm consists of picking an element from the list (called the
    pivot) and then move all the elements bigger than the pivot to one side
    and the ones that are smaller to the other side.

    After that, we recursively call Quicksort on the two sides.

    Running time: O(nlogn) on average but O(n^2) worst case (this is solved by
    choosing a random pivot).
    '''
    array = _recsort(array, key)
    return array[::-1] if reverse else array
