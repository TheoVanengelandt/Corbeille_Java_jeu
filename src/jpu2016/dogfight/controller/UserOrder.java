package jpu2016.dogfight.controller;

import java.util.Hashtable;

public class UserOrder implements IUserOrder{
	
	private int player;
	Hashtable<Integer, Order> list_Players_Orders = new Hashtable<Integer, Order>();
	
	public UserOrder(int player, Order order){
				
		list_Players_Orders.put(player,order);	
	}

	public int getPlayer() {
		return player;
	}

	@Override
	public Order getOrder() {
		
		return list_Players_Orders.get(getPlayer());
	}
	

}
