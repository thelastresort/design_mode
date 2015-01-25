package com.rj.designmode.duck.behaviour;

public class Quack implements QuackBehavior
{

	@Override
	public void quack()
	{
		System.out.println("Quack");
	}

}
