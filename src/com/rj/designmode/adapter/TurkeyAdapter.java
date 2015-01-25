package com.rj.designmode.adapter;

import com.rj.designmode.duck.Duck;

public class TurkeyAdapter extends Duck {

	Turkey mTurkey;

	public TurkeyAdapter(Turkey turkey) {
		mTurkey = turkey;
	}

	public void quack() {
		mTurkey.gobble();
	}

	public void fly() {
		for (int i = 0; i < 5; i++)
			mTurkey.fly();
	}

	@Override
	public void display() {

	}

}
