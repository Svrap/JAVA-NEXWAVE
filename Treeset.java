package test;
import java.util.TreeSet;
//import java.util.Iterator;

public class Treeset {
	public static void main(String[] args)
	{
		TreeSet<String> tset =  new TreeSet<>();
		tset.add("Welcome");
		tset.add("Hello");
		tset.add("Farewel");
		tset.add("Zebra");
		for(String s: tset)
			System.out.println(s);
		
	}

}
