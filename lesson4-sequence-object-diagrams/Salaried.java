package edu.mum.mpp.lesson4;

public class Salaried extends Employee
{
	private double salary;
	
	Salaried(int empId,double salary)
	{
		super(empId);
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Salaried [salary=" + salary + "]";
	}

	@Override
	public double calcGrossPay(int month, int year) {
		return salary;
	}
	
	
}
