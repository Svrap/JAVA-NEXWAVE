package test;
import java.util.ArrayList;
import java.util.ListIterator;


public class Alist {

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Welcome");
		list.add("Hello");
		list.add("Apple");
		list.add(2,"welcome");//insert using index
		list.add("farewell");
		list.add("Bye Bye");
		for(String s : list)
			System.out.println(s);
		System.out.println("\n");
		//using index method to retrieve
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println("\n");
		//using Iterator and can traverse bi directional
		ListIterator<String> itr = list.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println();
		while(itr.hasPrevious())
			System.out.println(itr.previous());

	}

}
