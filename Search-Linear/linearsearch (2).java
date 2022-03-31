
public class linearsearch {
public int lsearch(int a[],int x) {
		for(int i=0;i<=a.length-1;i++) {
			if (a[i]==x) {
			    return i;
			}
		}
		return -1;
	}
public static void main(String args[]) {
	int a[] = {12,18,24,33,40};
	int x = 33;
	linearsearch ls = new linearsearch();
	System.out.println("Position is "+ls.lsearch(a, x));
}
}
