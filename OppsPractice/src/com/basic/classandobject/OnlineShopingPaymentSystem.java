package com.basic.classandobject;
abstract class Product{
	private int productId;
	private String productName;
	private double price;
	
	public Product(int productId, String productName, double price) {
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		
		
	}
	public double getPrice() {
        return price;
    }
	public void displayProductDetails(){
		System.out.println("Product name is "+productName+" with id "+productId+" and price is "+price);
	}
	public abstract double calculateDiscount();
}

class Electronics extends Product{
	public Electronics(int productId, String productName, double price) {
		super(productId, productName, price);
	}
	@Override
	public double calculateDiscount() {
		return getPrice()*10/100;
	}
}
class Clothing extends Product{
	public Clothing(int productId, String productName, double price) {
		super(productId, productName, price);
	}
	@Override
	public double calculateDiscount() {
		return getPrice()*20/100;
	}
}
interface Payment1{
	void pay(double amount);
}
class UPIPayment implements Payment1{
	@Override
	public void pay(double amount) {
		System.out.println("Paid "+amount+" using UPI");
	}
}
public class OnlineShopingPaymentSystem {
public static void main(String[] args) {
	Product p1=new Electronics(1,"Laptop",50000);
	Product p2=new Clothing(2,"Jacket",2000);
	p1.displayProductDetails();
    double finalPrice1 = p1.getPrice() - p1.calculateDiscount();

    Payment1 pp1 = new UPIPayment();
    pp1.pay(finalPrice1);

    System.out.println("--------------------");

    p2.displayProductDetails();
    double finalPrice2 = p2.getPrice() - p2.calculateDiscount();
    pp1.pay(finalPrice2);
	
}
}
