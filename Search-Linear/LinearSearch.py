def linear_search(lst, search_item):
    low = 0
    search_result = False

    while low < len(lst) and not search_result:
        if lst[low] == search_item:
            search_result = True
        else:
            low += 1
    return search_result


lst = [12, 34, 25, 15, 67, 23, 11, 5, 86]
value = 91
result = linear_search(lst, value)
if result:
    print("Элемент найден!")
else:
    print("Элемент не найден!")