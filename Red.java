package test1;


import java.io.FileReader;
import java.io.IOException;

public class Red {
	public static void main(String[] args) {
		try (FileReader fis = new FileReader("bcd.dat")) {
			int ch;
			while((ch=fis.read())!=-1)
				System.out.println((char)(ch)+ " ");
			
		} catch (IOException ex1) {
			System.out.println(ex1);
		}
	}

}
