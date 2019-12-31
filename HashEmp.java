package test;
import java.util.LinkedHashSet;

//obj class is super class of every classes in java
	 class Employee1 {
		int empid;
		String ename;
		double salary;
		public Employee1(int empid, String ename, double salary) {
			super();
			this.empid = empid;
			this.ename = ename;
			this.salary = salary;
		}
		public void display() {
			System.out.println(empid+ " " + ename + " " + salary);
		}
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
			Employee1 other = (Employee1) obj;
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
		
		
	}
	

public class HashEmp {
	public static void main(String [] args)
	{
		LinkedHashSet<Employee1> eh = new LinkedHashSet<Employee1>();
		eh.add(new Employee1(101,"Ajay",1000.00));
		eh.add(new Employee1(102,"vAjay",1000.00));
		eh.add(new Employee1(103,"ash",4000.00));
		eh.add(new Employee1(104,"je",1000.00));
		eh.add(new Employee1(104,"je",1000.00));
		for(Employee1 e : eh)
			e.display();
	}
}
