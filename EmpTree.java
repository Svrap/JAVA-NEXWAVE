package test;


import java.util.TreeSet;

public class EmpTree {

	public static void main(String[] args)
	{
		TreeSet<Employee> tset =  new TreeSet<>();
		tset.add(new Employee(102,"babu",2000));
		tset.add(new Employee(101,"dj",5000));
		tset.add(new Employee(103,"vj",2000));
		tset.add(new Employee(104,"ajay",4000));
		for(Employee s: tset)
			System.out.println(s);
		
	}

}

 class Employee implements Comparable<Employee> {
	int empid;
	String ename;
	int salary;
	public Employee(int empid, String ename, int salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	public int compareTo(Employee e)
	{
		return empid-e.empid;
	}
	
 }
	