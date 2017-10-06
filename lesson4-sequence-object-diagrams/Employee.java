package edu.mum.mpp.lesson4;

public abstract class Employee 
{
	private int empId;
	
	public void print()
	{
		//TEST
		System.out.println("Employee [empId=" + empId +  " " + calcCompensation(10,2017) + "]");
	}
	
	

	Employee(int empId)
	{
		this.empId=empId;
	}
	
	public Paycheck calcCompensation(int month, int year)
	{
		Paycheck result = new Paycheck(calcGrossPay(month,year));
		return result;
	}
	
	public abstract double calcGrossPay(int month, int year);
	
}
