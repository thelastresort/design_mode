package com.rj.designmode.factory.pizza;

import java.util.ArrayList;

public abstract class Pizza {

	String mName;
	String mDough;
	String mSauce;
	ArrayList<String> mToppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("Preparing " + mName);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:  ");
		for (String topping : mToppings) {
			System.out.println("  " + topping);
		}

	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonnal slices");
	}

	public void box() {
		System.out.println("Place pizza in officaial PizzaStore box");
	}

	public String getName() {
		return mName;
	}

}
