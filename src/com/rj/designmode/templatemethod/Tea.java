package com.rj.designmode.templatemethod;

public class Tea extends CaffeineBeverage {

	public void steepTeaBag() {
		System.out.println("Steeping the tea");
	}

	public void addLemon() {
		System.out.println("Adding Lemon");
	}

	@Override
	protected void brew() {
		steepTeaBag();
	}

	@Override
	protected void addCondiments() {
		addLemon();
	}

}
