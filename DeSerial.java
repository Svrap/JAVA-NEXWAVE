package test1;
import java.io.*;
public class DeSerial {

	public static void main(String[] args) throws ClassNotFoundException
	{
		Employee e = null;
		try(FileInputStream fos = new FileInputStream("emp.dat");
				ObjectInputStream ois = new ObjectInputStream(fos);) 
		{
			e = (Employee)ois.readObject();
			System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary());	
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
}



