/*
Bubble sort is a popular sorting algorithm which works by repeatedly *swapping adjacent elements* that are out of order. While asymptotically equivalent to the other O(n^{2}) algorithms, it will require O(n^{2}) swaps in the worst-case.

Time complexity:
				Best : O(n)
				Average : O(n^2)
				Worst : O(n^2)

				It can be optimized by stopping the algorithm if inner loop didn’t cause any swap.

Space complexity: O(1)

Sudo Code:

Bubblesort( var a as array )
		for i from 1 to N
			for j from 0 to N - 1
				if a[j] > a[j + 1]
					swap( a[j], a[j + 1] )
end
*/

function bubblesort(A) {
	var n = A.lenght;
	var temp;
	for(int i = 0; i < n; i ++) {
		for (int j = 0; j < n - i, i ++) {
			if (A[j] > A[j + 1]) {
				temp = A[j];
				A[j] = A[j + 1];
				A[j + 1] = temp;
			}
		}
	}
	return A;
}