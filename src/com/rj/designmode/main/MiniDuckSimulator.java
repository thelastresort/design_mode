package com.rj.designmode.main;

import com.rj.designmode.duck.Duck;
import com.rj.designmode.duck.MallardDuck;
import com.rj.designmode.duck.ModelDuck;
import com.rj.designmode.duck.behaviour.FlyRocketPowered;

public class MiniDuckSimulator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Duck mallard = new MallardDuck();
		mallard.peformFly();
		mallard.peformQuack();
		 
		Duck model = new ModelDuck();
		model.peformFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.peformFly();
	}

}
