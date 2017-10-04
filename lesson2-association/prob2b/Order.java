package edu.mum.mpp.prob2b;

import java.util.List;

public class Order {

	private long orderNum;
	
	private List<OrderLine> orderLine;
	
	
	public long getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(long orderNum) {
		this.orderNum = orderNum;
	}
	public List<OrderLine> getOrderLine() {
		return orderLine;
	}
	public void setOrderLine(List<OrderLine> orderLine) {
		this.orderLine = orderLine;
	}
	

}
