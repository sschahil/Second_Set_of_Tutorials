import java.util.*;
public class Account {
	
	private double balance; // instance variable that stores balance
	
	public Account(double initialBalance) {
		
		if(initialBalance > 0.0) // Validates that the initial balance put into the account is more than $0.00
			balance = initialBalance;
	}// end of constructor
	
	public void deposit(double amount) {
	
		balance += amount; // add amount to the balance
	}// end of method credit
	
	public double get(){
		
		return balance;
	}// end of method get
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account(50.50);
		Account acc2 = new Account(-50.50);
		Account acc3 = new Account(0.00);
		Account acc4 = new Account(50000000.50);
		Account acc5 = new Account(1500.15);
		
		//account 1
		System.out.printf("The initial balance to the account 1 is: $%.2f\n", acc1.get());
		acc1.deposit(500.15);
		System.out.printf("After depositing to account 1, the new balance is: $%.2f \n\n", acc1.get());
		
		//account 2
		System.out.printf("The initial balance to the account 2 is: $%.2f\n", acc2.get());
		acc2.deposit(500.15);
		System.out.printf("After depositing to account 2, the new balance is: $%.2f \n\n", acc2.get());
				
		//account 3
		System.out.printf("The initial balance to the account 3 is: $%.2f\n", acc3.get());
		acc3.deposit(500.15);
		System.out.printf("After depositing to account 3, the new balance is: $%.2f \n\n", acc3.get());
				
		//account 4
		System.out.printf("The initial balance to the account 4 is: $%.2f\n", acc4.get());
		acc4.deposit(500.15);
		System.out.printf("After depositing to account 4, the new balance is: $%.2f \n\n", acc4.get());
		
		//Allowing the user to enter a deposit
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double depositAmount;
		
		System.out.println("Enter the deposit amount for account 5: "); // prompt
		depositAmount = input.nextDouble(); // obtain user amount
		
		System.out.printf("The initial balance of account 5 is: $%.2f\n", acc5.get()); // displays initial balance of account 5
		System.out.printf("Adding the amount $%.2f to account 5.\n", depositAmount); // showing user the amount being added to account 5
		acc5.deposit(depositAmount); // adding the deposit amount to the account 5
		System.out.printf("Account 5 Balance: $%.2f", acc5.get());
		
	} // end of class Account

}
