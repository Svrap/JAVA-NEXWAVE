package test1;
import java.io.*;

public class PersonSer implements java.io.Serializable {
	public static void main(String[] args) {
		Student S = new Student(101, "Ajay", 20, 21, 50, 50, 50);
		try(FileOutputStream fos = new FileOutputStream("student.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) 
		{
			//oos.defaultWriteObject(e);	
			oos.writeObject(S);
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
}