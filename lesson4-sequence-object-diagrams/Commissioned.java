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
	
	private List<Order> orderList()
	{
		List<Order> list = new ArrayList<>();
		
		for(int k =1 ; k<6 ;++k)
		{
			Order ord = new Order(k,LocalDate.of(2017, 1, 1), k * 50.0);
			
			list.add(ord);
			
		}
		
		
		return list;
		
	}
	private double getTotal()
	{
		double totalOrder =0.0;
		if (orderList() != null)
			for(Order o: orderList())
			 totalOrder +=o.getOrderAmount();
		
		return totalOrder;
	}
	
	@Override
	public double calcGrossPay() {

		return (getTotal() * commission) + baseSalary;
	}
	
}
