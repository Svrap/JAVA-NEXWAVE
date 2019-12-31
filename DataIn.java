package test1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIn {
public static void main(String[] args) {
	try (FileOutputStream fis = new FileOutputStream("abc.dat");
			DataOutputStream dos = new DataOutputStream(fis)) {
		int i=2134567;
		float f=1235.67f;
		double d = 9999.99999;
		dos.writeInt(i);
		dos.writeFloat(f);
		dos.writeDouble(d);
		
	} catch (IOException ex1) {
		System.out.println(ex1);
	}
}
}
