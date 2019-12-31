package dummy;

public class depemp {
 

	public static void main(String [] args)
	{
		//Dept d = new Dept(10,"sales",new Employee(101,"jhon",2500));
		//Dept d[] ;
		//Dept d[] ={new Dept(10,"sales",new Employee(101,"jhon",2500)),new Dept(10,"sales",new Employee(101,"jhon",2500))};
		//for (int i=0;i<2;i++)
		//{
		//	System.out.println(d[i]);
		//}
		Employee e1 = new Employee(101,"ajay",1000);
		Employee e2 = new Employee(101,"ajay",2000);
		System.out.println(e1.equals(e2));
		
	}
}

