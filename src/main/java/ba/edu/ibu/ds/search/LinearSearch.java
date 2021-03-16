package ba.edu.ibu.ds.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] elements = new int[] {6, 13, 14, 25, 33, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97, 100};
		
		int search = 100; 
		for (int i = 0 ; i < elements.length; i++) {
			if (elements[i] == search) {
				System.out.println("Found it on position " + i);
			}
		}
	}
}
