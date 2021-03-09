package ba.edu.ibu.ds;

public class Main {

	public static void main(String[] args) throws Exception {
		LinkedList a = new LinkedList();
		a.add("aaa");
		a.add("bbb");
		a.add("ccc");
		a.add("ddd");
		a.add("eee");
		
		System.out.println(a.getLast());
		
		System.out.println(a.remove(3));

		System.out.println(a.toString());
		
		//System.out.println("done");
		/*
		System.out.println(a.size());
		
		System.out.println(a.size());
		
		System.out.println(a.size());
		
		System.out.println(a.size());*/
	}
}
