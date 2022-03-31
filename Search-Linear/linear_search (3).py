def linear_search(array, element):
    for i in range(len(array)):
        if array[i] == element:
            return True, i

    return False, i