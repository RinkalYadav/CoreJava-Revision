package com.basic.classandobject;
class Person {
    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }
}
public class EncapsulationProblem1 {
public static void main(String[] args) {
	Person p1 = new Person();

	p1.setName("Rinkal");
	p1.setAge(22);
	p1.setSalary(50000);

	System.out.println(p1.getName());
	System.out.println(p1.getAge());
	System.out.println(p1.getSalary());

	p1.setAge(-5);       // Should print Invalid Age
	p1.setSalary(-100);  // Should print Invalid Salary
}
}
