package test1;

import java.io.FileWriter;
import java.io.IOException;

public class Wri {
	public static void main(String[] args) {
		try (FileWriter fos1 = new FileWriter("abc.dat",true)) {
			for (int i = 97; i <=122; i++)
				fos1.write(i);
		} catch (IOException ex1) {
			System.out.println(ex1);
		}
	}

}
