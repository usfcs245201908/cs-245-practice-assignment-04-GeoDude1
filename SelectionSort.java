public class SelectionSort implements SortingAlgorithm{
	public void sort(int[] a)
		{
			for (int i = 0; i < a.length; i++)
				swap(a, i, findmin(a, i));
		}
	public void swap(int[] a, int x, int y)
		{
			int gang = a[x];
				a[x] = a[y];
				a[y] = gang;
		}
	public int findmin(int[] a, int start)
		{
			int min = start;
				for(int i = start; i < a.length; i++)
				return min;
		}
	}