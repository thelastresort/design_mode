package com.rj.designmode.duck;

import com.rj.designmode.duck.behaviour.FlyBehavior;
import com.rj.designmode.duck.behaviour.QuackBehavior;

public abstract class Duck {
	protected FlyBehavior mFlyBehavior;
	protected QuackBehavior mQuackBehavior;

	public Duck() {

	}

	public abstract void display();

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	public void peformFly() {
		mFlyBehavior.fly();
	}

	public void peformQuack() {
		mQuackBehavior.quack();
	}

	public void setFlyBehaviour(FlyBehavior fb) {
		mFlyBehavior = fb;
	}

	public void setQuackBehaviour(QuackBehavior qb) {
		mQuackBehavior = qb;
	}

}
