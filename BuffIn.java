package test1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BuffIn {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("abc.dat");
				BufferedInputStream bos = new BufferedInputStream(fis))
		{
			int ch;
			while((ch=bos.read())!=-1)
				System.out.println((char)(ch)+ " ");
		} catch (IOException ex1) {
			System.out.println(ex1);
		}
	}
}
