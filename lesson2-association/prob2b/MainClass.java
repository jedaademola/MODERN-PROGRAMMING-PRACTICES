package edu.mum.mpp.prob2b;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		Order newOrder = new Order();
		newOrder.setOrderNum(1);
		
		OrderLine list1 = new OrderLine();
		list1.setCost(100.50);
		list1.setQuantity(10);
		
		OrderLine list2 = new OrderLine();
		list2.setCost(200);
		list2.setQuantity(20);
		
		List<OrderLine> orderList = new ArrayList<>();
		orderList.add(list1);
		orderList.add(list2);
		
		
		newOrder.setOrderLine(orderList);

	}

}
