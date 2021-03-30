package ba.edu.ibu.ds.sort;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {

	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi, Comparator comp) {

		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}

		int i = lo, j = mid + 1;

		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > hi) {
				a[k] = aux[i++];
			} else if (less(aux[j], aux[i], comp)) {
				a[k] = aux[j++];
			} else {
				a[k] = aux[i++];
			}
		}
	}

	private static boolean less(Comparable a, Comparable b, Comparator comp) {
		if (comp == null) {
			return a.compareTo(b) < 0; // natural order in comparable interface
		}else {
			return comp.compare(a, b) < 0; // override natural order with comparator
		}
		
	}

	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi, Comparator comp) {
		if (hi <= lo)
			return;

		int mid = lo + (hi - lo) / 2;

		sort(a, aux, lo, mid, comp);
		sort(a, aux, mid + 1, hi, comp);
		merge(a, aux, lo, mid, hi, comp);
	}

	private static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1, null);
	}

	private static void sort(Comparable[] a, Comparator comp) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1, comp);
	}
	
	public static class ReverseInt implements Comparator<Integer>{

		public int compare(Integer o1, Integer o2) {
			return -o1.compareTo(o2);
		}
	}

	public static void main(String[] args) {
		Integer[] a = new Integer[] { 4, 6, 7, 1, 3, 9, 15, 12, 10, 8, 9, 19, 11, 13, 20, 7 };

		MergeSort.sort(a);

		System.out.println(Arrays.toString(a));
		
		MergeSort.sort(a, new MergeSort.ReverseInt());

		System.out.println(Arrays.toString(a));
	}
}
