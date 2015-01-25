package com.rj.designmode.decorater.decorated;

public class Espresso extends Beverage
{
	public Espresso()
	{
		mDescription = "Espresso";
	}
	@Override
	public double cost()
	{
		return 1.99;
	}

}
