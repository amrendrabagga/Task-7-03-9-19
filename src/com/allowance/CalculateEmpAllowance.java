package com.allowance;

public class CalculateEmpAllowance {
	public static void main(String args[]) {
		Employee emp1 = new Employee(111, "rahul", 10000);
		Employee emp2 = new Employee(112, "chirag", 20000);
		Employee emp3 = new Employee(113, "anuj", 30000);
		Employee emp4 = new Employee(114, "tanish", 40000);
		Employee emp5 = new Employee(115, "manav", 50000);
		
		emp1.start();
		emp2.start();
		emp3.start();
		emp4.start();
		emp5.start();
	}

}
