package com.basic.classandobject;
class BankAccount2{
	private String accountNumber;
	private String holderName;
	private double balance;
	
	BankAccount2(String accountNumber, String holderName){
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=0;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getBalance() {
		return balance;
	}
	void deposit(double amount) {
		if(amount>0) {
			this.balance=balance+amount;
		}
		else {
			System.out.println("Invalid deposit");
		}
		
	}
	void withdraw(double amount) {
		if(amount <= 0) {
            System.out.println("Invalid Withdraw Amount");
        }
        else if(amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance -= amount;
        }
	}
}
public class EncapsulationProblem3 {
public static void main(String[] args) {
	BankAccount2 b=new BankAccount2("101","Rinkal");
	b.deposit(5000);
	b.withdraw(2000);
	b.withdraw(5000);   // Should show Insufficient Balance
	b.deposit(-100);    // Should show Invalid Deposit

	System.out.println("Final Balance: " + b.getBalance());
}
}
