package com.rj.designmode.templatemethod;

public class Coffee extends CaffeineBeverage{
	
	public void brewCoffeeGrinds(){
		System.out.println("Dripping Coffee throught filter");
	}
	
	public void addSugarAndMilk(){
		System.out.println("Adding Sugar and Milk");
	}

	@Override
	protected void brew() {
		brewCoffeeGrinds();
	}

	@Override
	protected void addCondiments() {
		addSugarAndMilk();
	}
}
