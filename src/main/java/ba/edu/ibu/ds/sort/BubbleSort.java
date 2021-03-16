package ba.edu.ibu.ds.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] elements = new int[] {7, 10, 5, 3, 8, 4, 2, 9, 6};
		
		boolean swap = false;
		System.out.println(Arrays.toString(elements));
		
		for(int i = 0; i < elements.length; i++) {
			swap = false;
			for(int j = 1; j < elements.length; j++) {
				if (elements[j-1] > elements[j]) {
					int tmp = elements[j];
					elements[j] = elements[j-1];
					elements[j-1] = tmp;
					swap = true;
				}
				System.out.println(Arrays.toString(elements));
			}
			if (!swap) {
				break;
			}
		}
		
	}
}
