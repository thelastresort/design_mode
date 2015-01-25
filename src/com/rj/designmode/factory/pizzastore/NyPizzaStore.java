package com.rj.designmode.factory.pizzastore;

import com.rj.designmode.factory.pizza.NYStyleCheesePizza;
import com.rj.designmode.factory.pizza.Pizza;

public class NyPizzaStore extends PizzaStore{

	public static final int CHEESE_PIZZA = 1;
	
	@Override
	protected Pizza createPizza(int type) {
		
		if(type == CHEESE_PIZZA)
		{
			return new NYStyleCheesePizza(); 
		}else
		return null;
	}


}
