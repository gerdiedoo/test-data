
public class LinearSearch {

	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int searchN(int[] arr,  int x) {
		for (int i =0; i< arr.length; i++) {
			if (arr[i] == x) return i;
		}
		return -1;
	}

	
}
