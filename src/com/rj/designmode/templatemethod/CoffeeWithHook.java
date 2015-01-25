package com.rj.designmode.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverage {

	@Override
	protected void brew() {
		brewCoffeeGrinds();
	}

	@Override
	protected void addCondiments() {
		addSugarAndMilk();
	}

	public void brewCoffeeGrinds() {
		System.out.println("Dripping Coffee throught filter");
	}

	public void addSugarAndMilk() {
		System.out.println("Adding Sugar and Milk");
	}

	@Override
	protected boolean customerWantsCondiments() {
		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like milk and sugar with your coffee (y/n)?");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			System.err.println("IO error trying to read your answer");
		}
		
		if(answer == null)
		{
			return "no"; 
		}
		return answer;
	}
}
