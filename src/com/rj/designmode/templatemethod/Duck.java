package com.rj.designmode.templatemethod;


public class Duck implements Comparable<Duck> {

	private String mName;
	private int mWeight;

	public Duck(String name, int weight) {
		mName = name;
		mWeight = weight;
	}

	public String toString() {
		return mName + " weight " + mWeight;
	}

	@Override
	public int compareTo(Duck arg0) {

		Duck otherDuck = (Duck) arg0;
		if (mWeight < otherDuck.mWeight) {
			return -1;
		} else if (mWeight == otherDuck.mWeight) {
			return 0;
		} else {
			return 1;
		}
	}

}
