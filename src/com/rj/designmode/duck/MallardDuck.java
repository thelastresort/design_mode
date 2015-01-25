package com.rj.designmode.duck;

import com.rj.designmode.duck.behaviour.FlyWithWings;
import com.rj.designmode.duck.behaviour.Quack;

public class MallardDuck extends Duck
{
	public MallardDuck()
	{
		mFlyBehavior = new FlyWithWings();
		mQuackBehavior = new Quack();
	}
	@Override
	public void display()
	{
		System.out.println("I'm a real Mallard duck");
	}

	
}
