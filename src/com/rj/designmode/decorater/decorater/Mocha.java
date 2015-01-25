package com.rj.designmode.decorater.decorater;

import com.rj.designmode.decorater.decorated.Beverage;

public class Mocha extends CondimentDecorator
{
	private Beverage mBeverage;

	public Mocha(Beverage beverage)
	{
		mBeverage = beverage;
	}

	@Override
	public String getDescription()
	{
		return mBeverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost()
	{
		return 0.25 + mBeverage.cost();
	}

}
