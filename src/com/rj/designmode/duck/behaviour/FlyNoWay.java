package com.rj.designmode.duck.behaviour;

public class FlyNoWay implements FlyBehavior
{

	@Override
	public void fly()
	{
		System.out.println("I can't fly");
	}

}
