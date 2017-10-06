package edu.mum.mpp.lesson4;

public class Hourly extends Employee
{
	private double hourlyWage;
	private int hoursPerWeek;
	
	
	Hourly(int empId,double hourlyWage, int hoursPerWeek)
	{
		super(empId);
		this.hourlyWage= hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	@Override
	public double calcGrossPay() {
		//assume four weeks for each month.
		return hourlyWage * hoursPerWeek * 4;
	}

	@Override
	public String toString() {
		return "Hourly [hourlyWage=" + hourlyWage + ", hoursPerWeek=" + hoursPerWeek + "]";
	}
	
}
