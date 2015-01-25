package com.rj.designmode.decorater.decorated;

public class HouseBlend extends Beverage
{
	public HouseBlend()
	{
		mDescription = "House Blend Coffee";
	}
	
	@Override
	public double cost()
	{
		return 0.89;
	}

}
