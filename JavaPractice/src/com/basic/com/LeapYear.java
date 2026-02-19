package com.basic.com;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year to check whether leap or not ");
		int year=sc.nextInt();
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("Not leap year");
		}
	}

}
