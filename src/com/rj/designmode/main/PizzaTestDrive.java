package com.rj.designmode.main;

import com.rj.designmode.factory.pizza.Pizza;
import com.rj.designmode.factory.pizzastore.ChicagoPizzaStore;
import com.rj.designmode.factory.pizzastore.NyPizzaStore;
import com.rj.designmode.factory.pizzastore.PizzaStore;

public class PizzaTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore nyStore = new NyPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza(NyPizzaStore.CHEESE_PIZZA);
		System.out.println("Ethan ordered a " + pizza.getName() +"\n");
		
		pizza = chicagoStore.orderPizza(ChicagoPizzaStore.CHEESE_PIZZA);
		System.out.println("Joeal ordered a " + pizza.getName() + "\n");
		
	}

}
