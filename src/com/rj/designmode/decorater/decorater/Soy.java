package com.rj.designmode.decorater.decorater;

import com.rj.designmode.decorater.decorated.Beverage;

public class Soy extends CondimentDecorator
{
	private Beverage mBeverage;
	public Soy(Beverage beverage)
	{
		mBeverage = beverage;
	}
	
	@Override
	public String getDescription()
	{
		return mBeverage.getDescription()  + ", Mocah";
	}

	@Override
	public double cost()
	{
		return 0.15 + mBeverage.cost();
	}

}
