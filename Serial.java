package test1;
import java.io.*;

public class Serial {

	public static void main(String[] args) {

		Employee e = new Employee(786,"ABC",25000);
		try(FileOutputStream fos = new FileOutputStream("emp.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) 
		{
			//oos.defaultWriteObject(e);	
			oos.writeObject(e);
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
}

class Employee implements java.io.Serializable{
	int empid;
	String ename;
	int salary;
	public Employee() {}
	public Employee(int empid, String ename, int salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}


	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}


}