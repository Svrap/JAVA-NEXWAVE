package test;

public class Abccalc implements Calc{

	
	public double sum(int x, int y) {
		
		return x+y;
	}

	
	public double diff(int x, int y,int z) {
		
		return x-y-z;
	}

	
	public double mulp(int x, int y) {
		
		return x*y;
	}


	public double div(int x, int y) {
		
		return x/y;
	}

	public static void main (String [] args) {
		Abccalc a = new Abccalc();
	 System.out.println("Division of two number    " + a.div(20, 5));
	 System.out.println("Difference of two nummbers " + a.diff(20, 5,2));
	}
}