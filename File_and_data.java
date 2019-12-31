package test1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class File_and_data {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("abc.dat");
				DataInputStream dos = new DataInputStream(fis)) {
			int i=dos.readInt();
			float f=dos.readFloat();
			double d = dos.readDouble();
			System.out.println(i);
			System.out.println(f);
			System.out.println(d);
		} catch (IOException ex1) {
			System.out.println(ex1);
		}

	}

}
