package edu.mum.mpp.lesson4;

public abstract class Employee 
{
	private int empId;
	
	public void print()
	{
		//TEST
		System.out.println("Employee [empId=" + empId +  " " + calcCompensation(10) + "]");
	}
	
	

	Employee(int empId)
	{
		this.empId=empId;
	}
	
	public Paycheck calcCompensation(int month)
	{
		Paycheck result = new Paycheck(calcGrossPay());
		return result;
	}
	
	public abstract double calcGrossPay();
	
}
