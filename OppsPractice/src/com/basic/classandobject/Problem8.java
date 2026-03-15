package com.basic.classandobject;
class BankAccount3{
	private int acc_num;
	private String acc_holder_name;
	private double balance;
	
	public BankAccount3(int acc_num, String acc_holder_name, double balance){
		this.acc_num=acc_num;
		this.acc_holder_name=acc_holder_name;
		this.balance=balance;
	}
	public void deposit(double amount) {
		if(amount<=0) {
			System.out.println("Invalid deposit amount");
		}
		else {
			balance+=amount;
			System.out.println("Amount deposit successfully");
		}
	}
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid withrawal amount");
		}
		else if(amount>balance) {
			System.out.println("Insufficient balance");
		}
		else {
			balance-=amount;
			System.out.println("Withrawal successfull");
		}
	}
	public void checkBalance() {
		System.out.println("Your current balance is "+balance);
	}
	public void displayAccountDetails() {
		System.out.println("Account number is "+acc_num+" and Account holder name is "+acc_holder_name+" and available balance is "+balance);
	}
}
public class Problem8 {
public static void main(String[] args) {
	BankAccount3 ob=new BankAccount3(101,"Rinkal",20000);
	ob.deposit(10000);
	ob.withdraw(15000);
	ob.checkBalance();
	ob.displayAccountDetails();
}
}
