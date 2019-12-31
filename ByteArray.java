package test1;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArray {

	public static void main(String[] args) {
		byte[] arr = {10,20,30,40,50};
		try (ByteArrayInputStream bis = new ByteArrayInputStream(arr)) {
			int ch;
			while((ch=bis.read())!=-1)
				System.out.println((ch)+ " ");
			
		} catch (IOException ex1) {
			System.out.println(ex1);
		}
	}
}
