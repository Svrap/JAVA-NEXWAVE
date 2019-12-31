package test;

import java.util.HashSet;
import java.util.Iterator;

public class Hashtest {

	public  static void main(String[] args)
			{
				HashSet<String> hs= new HashSet<String>();
				hs.add("Welcome");
				hs.add("Hello");
				hs.add("Bye");
				hs.add("Farewell");
				//System.out.println(hs.size());
				
				//method 1 for retrieval of values
				//for(String s : hs)
				//	System.out.println(s);
				//hs.remove("Hello"); //removes the element 
				///println(hs.remove("hi"));
				//hs.clear(); //clear everything 
				System.out.println(hs.contains("hello"));
				HashSet<String> hs1 = new HashSet<String>();
				hs1.add("Hello");
				hs1.add("banana");
		/*
		 * //hs.addAll(hs1); //adds all the elements to hs from hs1
		 * //hs.removeAll(hs1);//removes elements in hs1 that are matched with hs
		 * //hs.retainAll(hs1);//retains all the elements matched with hs by hs1 //
		 * for(String s: hs) // System.out.println(s);
		 */		
			
			}
}
