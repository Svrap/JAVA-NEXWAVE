package test1;
import java.sql.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonDeser {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Student S = null;
		try(FileInputStream fos = new FileInputStream("student.txt");
				ObjectInputStream ois = new ObjectInputStream(fos);) 
		{
			S = (Student)ois.readObject();
			
			System.out.println(S.getSsn()+" "+S.getName()+" "+S.getAge()+" "+S.getRollno()+" "+S.getM1()+" "+S.getM2()+" "+S.getM3());	
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		
		
 
		
		
		
	}
}
