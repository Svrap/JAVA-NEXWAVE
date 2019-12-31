package test;

public class InsufficientFundsException extends Exception {

	 private double amount;
	   
	   public InsufficientFundsException(double amount) {
	      this.amount = amount;
	   }
	   
	   public double getAmount() {
	      return amount;
	   }
	}

public class StudentAlreadyEnteredException extends Exception {
	
	private int S;

	public StudentAlreadyEnteredException(int s) {
		
		this.S = s;
	}

	public int getS() {
		return S;
	}


  
	
}