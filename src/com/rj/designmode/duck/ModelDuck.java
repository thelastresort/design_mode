package com.rj.designmode.duck;

import com.rj.designmode.duck.behaviour.FlyNoWay;
import com.rj.designmode.duck.behaviour.Quack;

public class ModelDuck extends Duck
{
	public ModelDuck()
	{
		mFlyBehavior = new FlyNoWay();
		mQuackBehavior = new Quack();
	}

	@Override
	public void display()
	{
		System.out.println("I'm a model duck");
	}

}
