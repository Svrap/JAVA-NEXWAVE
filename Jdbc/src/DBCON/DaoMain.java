package DBCON;
import java.sql.Date;
import java.util.ArrayList;

import DBCON.Employee;
public class DaoMain {

	public static void main(String[] args) {

		Employee e =   new Employee(101,"Raja",3000,new Date(1990,10,12));
		DaoEmp edao = new DaoEmp();
//		if(edao.insertEmployee(e))
//			System.out.println("Employee record Inserted");
//		else
////			System.out.println("Insertion Failed");

		//update
		if(edao.modifyEmployee(e))
			System.out.println("Employee record Updated");
		else
			System.out.println("Update Failed");
		
		//Retrieveing the details
//		ArrayList<Employee> elist = edao.getEmployee();
//		for(Employee e : elist)
//			System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary());
		
//		//Retrieve one employee
//		Employee e = edao.getEmployee(1);
//		if(e!=null)
//			System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary());
//		else
//			System.out.println("Employee doest not exist");
		if(edao.removeEmployee(101))
			System.out.println("Employee deleted");
		else
			System.out.println("Employee doest not exist");
		
	}
}
