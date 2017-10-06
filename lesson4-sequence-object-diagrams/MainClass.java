package edu.mum.mpp.lesson4;

public class MainClass {

	public static void main(String[] args) {
		
		Employee [] employee = new Employee[3];
		
		Hourly hourlyEmployee = new Hourly(1,200,40); 
		 
		Commissioned comissioedEmployee = new Commissioned(2,0.5,200);
		Salaried salaryEmployee = new Salaried(3,500);
		
		employee[0]=hourlyEmployee;
		employee[1]=comissioedEmployee;
		employee[2]=salaryEmployee;
		
		printSalary(employee,10,2017);
		

	}
	
	public static void printSalary(Employee [] employee,int month,int year )
	{
		for(Employee e: employee)
		{
			System.out.println(e.calcCompensation(month,year));
			e.print();
			System.out.println();
		}
	}

}
