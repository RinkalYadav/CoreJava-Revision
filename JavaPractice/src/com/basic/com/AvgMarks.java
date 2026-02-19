package com.basic.com;
import java.util.Scanner;
public class AvgMarks {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	int total=0;
	double avg;
	System.out.println("Enter the physic's Marks");
	int psy=sc.nextInt();
	count++;
	System.out.println("Enter the Chemistry's Marks");
	int chem=sc.nextInt();
	count++;
	System.out.println("Enter the Biology's Marks");
	int bio=sc.nextInt();
	count++;
	System.out.println("Enter the programming's Marks");
	int pg=sc.nextInt();
	count++;
	System.out.println("Enter the Math's Marks");
	int mth=sc.nextInt();
	count++;
	
	total=(psy+chem+bio+pg+mth);
	avg=total/count;
	System.out.println("average marks of students "+avg);
	
}
}
