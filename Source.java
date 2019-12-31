package dummy;
//import java.util.*;

public class Source {
	public static void main (String [] args)
	{
		//System.out.println("hello world");
		//Scanner sc = new Scanner(System.in);
		String[] a = {"welcome","to","java"};
		//a  = sc.next();
				for(int i=a.length-1;i>=0;i--)
				{
					for(int j=a[i].length()-1;j>=0;j--)
					{
					System.out.println(a[i].charAt(j)+" ");
					System.out.println();
				}
				}
		
	}
}
 
