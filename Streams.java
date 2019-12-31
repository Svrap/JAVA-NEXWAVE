package test1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Streams {
	public static void main(String[] args) {

		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream("abc.dat");
			for(int i = 65;i<90;i++) fos.write(i);
		}
		catch(IOException ex) 
		{
			System.out.println(ex); 
		} 
		finally 
		{
			try
			{ 
				if(fos!=null) fos.close();
			}

			catch(IOException ex1)
			{ 
				System.out.println(ex1);
			}
		}


		// method 2
		try (FileOutputStream fos1 = new FileOutputStream("bcd.dat")) {
			for (int i = 65; i < 90; i++)
				fos1.write(i);
		} catch (IOException ex1) {
			System.out.println(ex1);
		}
	}
}
