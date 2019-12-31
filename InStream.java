package test1;

import java.io.FileInputStream;

import java.io.IOException;

public class InStream {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("bcd.dat")) {
			int ch;
			while((ch=fis.read())!=-1)
				System.out.println((char)(ch)+ " ");
			
		} catch (IOException ex1) {
			System.out.println(ex1);
		}
	}
}
