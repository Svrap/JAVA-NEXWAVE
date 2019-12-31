package test1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffOut {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("abc.dat");
				BufferedOutputStream bos = new BufferedOutputStream(fos))
		{
			for(int i=65;i<90;i++)
				bos.write(i);
		} catch (IOException ex1) {
			System.out.println(ex1);
		}
	}
}
