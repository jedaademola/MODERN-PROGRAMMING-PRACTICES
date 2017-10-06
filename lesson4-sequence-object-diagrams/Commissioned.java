package edu.mum.mpp.lesson4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee
{
	private double commission;
	private double baseSalary;
	//private List<Order> order;
	
	
	
	Commissioned(int empId,double commission,double baseSalary)//,List<Order> order)
	{
		super(empId);
		this.commission= commission;
		this.baseSalary =baseSalary;
		//this.order = order;
		
	}
	
	private List<Order> orderList(int month, int year)
	{
		List<Order> list = new ArrayList<>();
		
		for(int k =1 ; k<6 ;++k)
		{
			Order ord = new Order(k,LocalDate.of(year, month, k), k * 50.0);
			
			list.add(ord);
			
		}
		
		
		return list;
		
	}
	private double getTotal(int month, int year)
	{
		double totalOrder =0.0;
		
		List<Order> list = orderList( month,  year);
		
		if ( list != null)
			for(Order o: list)
			{
				//System.out.println((o.getOrderDate().getMonthValue()));
				//System.out.println((o.getOrderDate().getYear()));
				//System.out.println((o.getOrderDate().getMonth()));
				//System.out.println(month);
				
				if (o.getOrderDate().getMonthValue() == month && o.getOrderDate().getYear() == year)
					totalOrder +=o.getOrderAmount();
			}
		
		return totalOrder;
	}
	
	@Override
	public double calcGrossPay(int month, int year) {

		return (getTotal(month,year) * commission) + baseSalary;
	}
	
}
