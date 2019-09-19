public class BubbleSort implements SortingAlgorithm {
public void sort(int [] a) {
	for (int i=0; i<a.length-1; i++) {
		for (int j=0; j<a.length-1-i; j++) {
			if (a[j] > a[j+1]) {
				swap(a, j, j+1);
			}
			}
		}
	}
	public void swap(int[] a, int x, int j) {
		int temp = a[x];
			a[x] = a[j];
			a[j] = temp;
	}
}