package com.rj.designmode.templatemethod;

public abstract class CaffeineBeverage {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments())
			addCondiments();
	}

	protected abstract void brew();

	protected abstract void addCondiments();

	public void boilWater() {
		System.out.println("Boiling water");
	}

	public void pourInCup() {
		System.out.println("Pouring into cup");
	}

	protected boolean customerWantsCondiments() {
		return true;
	}
}
