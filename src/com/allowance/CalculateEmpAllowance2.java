package com.allowance;

public class CalculateEmpAllowance2 {

	public static void main(String[] args) {
		
		Employee2 emp1 = new Employee2(111, "rahul", 10000);
		Thread thread1 = new Thread(emp1); 
		Employee2 emp2 = new Employee2(112, "chirag", 20000);
		Thread thread2 = new Thread(emp2);
		Employee2 emp3 = new Employee2(113, "anuj", 30000);
		Thread thread3 = new Thread(emp3);
		Employee2 emp4 = new Employee2(114, "tanish", 40000);
		Thread thread4 = new Thread(emp4);
		Employee2 emp5 = new Employee2(115, "manav", 50000);
		Thread thread5 = new Thread(emp5);
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

	}

}
