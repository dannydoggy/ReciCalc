package main;

import java.util.ArrayList;
import java.util.List;

public class Recipet {
	private List<Order> orderList;
	
	public Recipet() {
		orderList = new ArrayList<Order>();
	}
	
	public void addOrder(Order order) {
		orderList.add(order);
	}
	
	public List<Order> getOrderList() {
		return orderList;
	}
}
