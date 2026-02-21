package com.basic.classandobject;
abstract class Account{
	private String ac_num;
	private double bal;
	
	Account(String ac_num, double bal){
		this.ac_num=ac_num;
		if(bal>0) {
			this.bal=bal;
		}
		else {
			System.out.println("Invalid balance set to be 0");
			this.bal=0;
		}
	}

	public double getBal() {
		return bal;
	}
	
	void deposit(double amount) {
		if(amount>0) {
			bal+=amount;
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}

	void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid withdraw amount");
		}
		else if(amount>bal) {
			System.out.println("Insufficient balance");
		}
		else {
			bal+=amount;
		}
	}
	
	abstract double calculateInterest();
	
}
class SavingsAccount extends Account{
	SavingsAccount(String acc_num, double bal){
		super(acc_num,bal);
		
	}
	double calculateInterest(){
	return getBal()*4/100;
	}
}
class CurrentAccount extends Account{
	CurrentAccount(String acc_num, double bal){
		super(acc_num,bal);
	}
	
	double calculateInterest(){
		return getBal()*6/100;
	}
}
	
public class Problem4 {
public static void main(String[] args) {
	Account ac1=new SavingsAccount("101", 10000);
	Account ac2=new CurrentAccount("102", 20000);
	ac1.deposit(2000);
    ac2.withdraw(5000);

    System.out.println("Savings Interest: " + ac1.calculateInterest());
    System.out.println("Current Interest: " + ac2.calculateInterest());

    System.out.println("Savings Balance: " + ac1.getBal());
    System.out.println("Current Balance: " + ac2.getBal());
}
	}
