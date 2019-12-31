package test;
//File Name BankDemo.java
public class BankDemo {

public static void main(String [] args) {
   Checking_Account c = new Checking_Account(101);
   System.out.println("Depositing $500...");
   c.deposit(500.00);
   
   try {
      System.out.println("\nWithdrawing $100...");
      c.withdraw(100.00);
      System.out.println("\nYour Balance "+c.getBalance());
      System.out.println("\nWithdrawing $600...");
      c.withdraw(600.00);
   } catch (InsufficientFundsException e) {
      System.out.println("Sorry, but you are short $" + e.getAmount());
      //e.printStackTrace();
   }
}
}