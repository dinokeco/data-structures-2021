package ba.edu.ibu.ds.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(Comparable[] elements) {
		boolean swap = false;
		
		for(int i = 0; i < elements.length; i++) {
			swap = false;
			for(int j = 1; j < elements.length; j++) {
				if (less(elements[j-1], elements[j])) {
					Comparable tmp = elements[j];
					elements[j] = elements[j-1];
					elements[j-1] = tmp;
					swap = true;
				}
			}
			if (!swap) {
				break;
			}
		}
	}
	
	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) > 0;
	}
	
	public static void main(String[] args) {
		
		Integer[] elements = new Integer[] {7, 10, 5, 3, 8, 4, 2, 9, 6};
		
		System.out.println(Arrays.toString(elements));
		BubbleSort.sort(elements);
		System.out.println(Arrays.toString(elements));
		
	}
}
