package com.rj.designmode.decorater.decorater;

import com.rj.designmode.decorater.decorated.Beverage;

public class Whip extends CondimentDecorator
{
	private Beverage mBeverage;

	public Whip(Beverage beverage)
	{
		mBeverage = beverage;
	}

	@Override
	public String getDescription()
	{
		return mBeverage.getDescription() + ", Whip";
	}

	@Override
	public double cost()
	{
		return 0.25 + mBeverage.cost();
	}

}
