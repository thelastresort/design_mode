package com.rj.designmode.factory.pizzastore;

import com.rj.designmode.factory.pizza.Pizza;

public abstract class PizzaStore {

	public Pizza orderPizza(int type){
		Pizza pizza;
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}

	protected abstract Pizza createPizza(int type);
}
