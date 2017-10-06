package edu.mum.mpp.lesson4;

import java.time.LocalDate;

public class Order 
{
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	
	public int getOrderNo() {
		return orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	Order(int orderNo,LocalDate orderDate,double orderAmount)
	{
		this.orderNo=orderNo;
		this.orderDate=orderDate;
		this.orderAmount=orderAmount;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderDate=" + orderDate + ", orderAmount=" + orderAmount + "]";
	}
	
}
