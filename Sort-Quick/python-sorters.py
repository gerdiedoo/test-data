# Randomly Generate a List of integers of size MAX
from random import randint #import the random integer function 
random_list1 = [] #initialize the random lists
random_list2 = []
random_list3 = []
random_list4 = []
random_list5 = []
random_list6 = []
MAX = 20
MIN = 0
for i in range(MIN, MAX):
	random_list1.append(randint(MIN,MAX))
	random_list2.append(randint(MIN,MAX))
	random_list3.append(randint(MIN,MAX))
	random_list4.append(randint(MIN,MAX))
	random_list5.append(randint(MIN,MAX))
	random_list6.append(randint(MIN,MAX))

print("Unsorted List:")
print(random_list1)




##########---------- O(N^2) Sorters ----------##########

###### ----- BUBBLE SORT ----- #####

def bubble_sort(l):
	n = len(l)
	for i in range(0, n):
		for j in range(0, n-i-1):
			if l[j] > l[j+1]:
				l[j+1], l[j] = l[j], l[j+1]
		print(l)
	return l


##### ----- SELECTION SORT ----- #####

def selection_sort(l):
	n = len(l)
	for i in range(0, n):

		min_idx = i
		for j in range(i+1, n):
			if l[j] < l[min_idx]:
				min_idx = j
		l[min_idx], l[i] = l[i], l[min_idx]
		print(l)
	return l


##### ----- INSERION SORT ----- #####

def insertion_sort(l):
	n = len(l)
	for i in range(1, n):
		key = l[i]
		for j in range(i-1, -1, -1):
			if key < l[j]:
				l[j+1], l[j] = l[j], l[j+1] 
			else:
				break
		print(l)
	return l


##########---------- O(N*LOG(N)) Sorters ----------##########

###### ----- MERGE SORT ----- #####

##### ----- QUICK SORT ----- ##### (pick the median element to be pivot)

def partition(l, low, high):
	pivot = l[high] #Get the pivot element
	i = low - 1 #Starting index for the partition

	for j in range(low, high):
		if l[j] < pivot:
			#Swap the ith and jth element and increment i
			i += 1
			l[j], l[i] = l[i], l[j]
			
	l[i+1] , l[high] = l[high], l[i+1]
	return i + 1


def quick_sort(l, low, high): #Low = Starting Index, High = Ending Index
	if low < high:
		piv_idx = partition(l,  low, high) #Partition the list and return the new pivot index
		print(l)
		quick_sort(l, low, piv_idx-1) #Before the pivot
		quick_sort(l, piv_idx+1, high) #After the pivot




##### ----- HEAP SORT ----- #####


 
##########---------- Hybrid Algorithms ----------##########

###### ----- TIM SORT ----- #####

##### ----- INTROSORT ----- #####

print("Bubble Sort:")
bubble_list = bubble_sort(random_list1)
print("Selection Sort:")
selection_list = selection_sort(random_list2) 
print("Insertion Sort:")
insertion_list = insertion_sort(random_list3) 
print("Quick Sort:")
quick_list = quick_sort(random_list4, 0, len(random_list4)-1) 