package dummy;

public class Dept {
 
	int Deptno;
	String DeptName;
	Employee emp;
	
	public Dept(int deptno, String deptName, Employee emp) {
		super();
		Deptno = deptno;
		DeptName = deptName;
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Dept [Deptno=" + Deptno + ", DeptName=" + DeptName +  "]" + emp;
	}
	public int getDeptno() {
		return Deptno;
	}
	public void setDeptno(int deptno) {
		Deptno = deptno;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
}


