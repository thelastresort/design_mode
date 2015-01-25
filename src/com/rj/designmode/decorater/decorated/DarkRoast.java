package com.rj.designmode.decorater.decorated;

public class DarkRoast extends Beverage
{
	public DarkRoast()
	{
		mDescription = "DarkRoast";
	}
	@Override
	public double cost()
	{
		return 2.89;
	}

	
}
