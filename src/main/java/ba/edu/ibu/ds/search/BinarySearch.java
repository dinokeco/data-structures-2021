package ba.edu.ibu.ds.search;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] elements = new int[] {6, 13, 14, 25, 33, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97, 100};
		
		int search = 100;
		int lo = 0;
		int hi = elements.length - 1;
		
		while(hi >= lo) {
			
			int middle = ((hi - lo) / 2) + lo; // int division
			
			if (elements[middle] == search) {
				System.out.println("Found it at position " + middle);
				break;
			}else if (elements[middle] > search) {
				hi = middle - 1;
			}else {
				lo = middle + 1;
			}
			
		}
		
		// log N
		System.out.println(Arrays.toString(elements));
	}
}
