package com.basic.com;

import java.util.Scanner;

//sal<=10000---> no taxes
//sal>10000 b/w sal<=100000 ---------> 10% tax
//sal>100000 ---------> 20%

public class Tax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sallery to count your tax");
		int sal=sc.nextInt();
		float tax;
		if(sal>100000) {
			tax=(sal*20)/100;
			System.out.println("your tax will be "+tax);
		}
		else if(sal<=100000 || sal>=10000){
			tax=(sal*10)/100;
			System.out.println("your tax will be "+tax);
		}
		else {
			System.out.println("Congrates you have not to pay tax");
		}
	}

}
