package ba.edu.ibu.ds.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		String[] elements = new String[] {
			"Q","U","I","C","K","S","O","R","T","E","X","A","M","P","L","E"
		};
		System.out.println(Arrays.toString(elements));
		QuickSort.sort(elements);
		System.out.println(Arrays.toString(elements));
	}
	
	
	public static void sort(Comparable[] a) {
		sort(a, 0, a.length-1);
	}
	
	public static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo) return;
		
		int j = partition(a, lo, hi);
		
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	public static int partition(Comparable[] a, int lo, int hi) {
		int i = lo;
		int j = hi+1;
		
		while(true) {
			// find item on left to swap
			while(less(a[++i], a[lo])) {
				if (i == hi) break;
			}
			// find item on right to swap
			while(less(a[lo], a[--j])) {
				if (j == lo) break;
			}
			
			//if pointers intersect break
			if (i >= j) break;
			
			exch(a, i, j);
		}
		exch(a, lo, j);
		System.out.println(Arrays.toString(a));
		return j;
	}
	
	private static void exch(Comparable[] a, int i, int j) {
		Comparable tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
}
