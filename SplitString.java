package test1;
import java.util.StringTokenizer;
public class SplitString {

	public static void main(String[] args) {
		String s = " Something to, Written and Show, To the Class";
		/*
		 * String[] s1 = s.split(","); for(int i=0;i<s1.length;i++)
		 * System.out.println(s1[i]);
		 */
		StringTokenizer st = new StringTokenizer(s,",");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
