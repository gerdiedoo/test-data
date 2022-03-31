
num_tries = 0
def binarysearch(numlist, target):
    global num_tries
    if len(numlist) == 0:
        print("The target is not in this list.")
    else:
        midpoint_index = len(numlist) // 2
        if numlist[midpoint_index] == target:
            num_tries += 1
            print("The target", target, "was found in", num_tries, "guesses.")
        elif numlist[midpoint_index] < target:
            num_tries += 1
            print("Guess: ", numlist[midpoint_index], "is too low")
            return binarysearch(numlist[midpoint_index + 1:], target)
        elif numlist[midpoint_index] > target:
            num_tries += 1
            print("Guess: ", numlist[midpoint_index], "is too high")
            return binarysearch(numlist[:midpoint_index], target)

def listmaker(min, max):
    '''Simple ordered numbers list maker'''
    alist = []
    for x in range(min, max):
        alist.append(x)
    return alist

#Examples to try:
#binarysearch(listmaker(1, 99999999), 38636313)
#binarysearch(listmaker(1, 10000), 2773)
#binarysearch([1, 4, 76, 456, 6666, 984345, 9824465], 76)
#binarysearch([1, 4, 76, 456, 6666, 984345, 9824465], 85423)
