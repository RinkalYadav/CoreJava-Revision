package com.basic.classandobject;
interface Payment{
	void pay(double amount);
}
class CreditCardPayment implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println("Payment of "+amount+" done using credit card");
	}
}
class UPIPayemnt implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println("Payment of "+amount+" done using UPI");
	}
}
public class Problem12 {
public static void main(String[] args) {
	Payment p1=new CreditCardPayment();
	Payment p2=new UPIPayemnt();
	p1.pay(5000);
	p2.pay(2000);
}
}
