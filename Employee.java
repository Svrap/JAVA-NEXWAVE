package dummy;

//import java.util.*;

class Employee {
	int empid;
	String ename;
	double salary;






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nEmployee details\n [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	public Employee(int empid, String ename, double salary) {
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}

	public  int getEmpid() {
		return empid;
	}
	public  void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}


import java.util.TreeSet;

public class EmpTree {

	public static void main(String[] args)
	{
		TreeSet<Employee> tset =  new TreeSet<>();
		tset.add(Employee(102,"babu",2000.00));
		tset.add(Employee(101,"dj",5000.00));
		tset.add(Employee(103,"vj",2000.00));
		tset.add(Employee(104,"ajay",4000.00));
		for(String s: tset)
			System.out.println(s);

	}
}




