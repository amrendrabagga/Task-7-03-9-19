package com.allowance;

public class Employee2 implements Runnable {
	private int eno;
	private String ename;
	private int sal;
	
	public Employee2(int eno, String ename, int sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}

	public void calculateAllowance() {
		System.out.println(eno + " " + ename + " " + sal + " HRA is " + sal*0.1);
		System.out.println(eno + " " + ename + " " + sal + " DA is " + sal*0.25);
		System.out.println(eno + " " + ename + " " + sal + " CA is " + sal*0.1);
	}
	@Override
	public void run() {
		calculateAllowance();
	}
	
}
