package com.basic.classandobject;
class BankAccount{
	String account_number;
	String holder_name;
	double balance;
	
	BankAccount(String account_number,String holder_name){
		
		this(account_number, holder_name, 0);
	}
	BankAccount(String account_number,String holder_name, double balance){
		this.account_number=account_number;
		this.holder_name=holder_name;
		this.balance=balance;
		
	}
	void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	void display() {
		System.out.println(holder_name+" bank account number is "+account_number+" and has "+balance+" rupees");
	}
}
public class Problem2 {
public static void main(String[] args) {
	BankAccount b1 = new BankAccount("101", "Rinkal");
	BankAccount b2 = new BankAccount("102", "Aman", 5000);

	b1.deposit(2000);
	b2.deposit(1000);

	b1.display();
	b2.display();
}
}
