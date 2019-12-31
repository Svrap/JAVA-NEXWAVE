package test1;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i ;
		String s;
		System.out.println("Enter a Number");
		i = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a String");
		s = sc.nextLine();
		System.out.println("THE NUMBER ENTERED: " + i);
		System.out.println("STRING ENTERED: " + s);
		

	}
}
