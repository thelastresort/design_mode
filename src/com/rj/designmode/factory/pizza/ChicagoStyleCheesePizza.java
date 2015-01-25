package com.rj.designmode.factory.pizza;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		mName = "Chicago Style Deep Dish Cheese Pizza";
		mDough = "Extra Thick Drust Dough";
		mSauce = "Plum Tomato Sauce";
		
		mToppings.add("Shredded Mozzarella Cheese");

	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
