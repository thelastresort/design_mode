package com.rj.designmode.main;

import com.rj.designmode.decorater.decorated.Beverage;
import com.rj.designmode.decorater.decorated.DarkRoast;
import com.rj.designmode.decorater.decorated.Espresso;
import com.rj.designmode.decorater.decorated.HouseBlend;
import com.rj.designmode.decorater.decorater.Mocha;
import com.rj.designmode.decorater.decorater.Soy;
import com.rj.designmode.decorater.decorater.Whip;

public class StarBuzzCoffee
{
	public static void main(String[] args)
	{
		
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

	}
}
