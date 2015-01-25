package com.rj.designmode.iterator;

public class MenuItem {
	String mName;
	String mDescription;
	boolean mVegetarian;
	double mPrice;

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		mName = name;
		mDescription = description;
		mVegetarian = vegetarian;
		mPrice = price;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmDescription() {
		return mDescription;
	}

	public void setmDescription(String mDescription) {
		this.mDescription = mDescription;
	}

	public boolean ismVegetarian() {
		return mVegetarian;
	}

	public void setmVegetarian(boolean mVegetarian) {
		this.mVegetarian = mVegetarian;
	}

	public double getmPrice() {
		return mPrice;
	}

	public void setmPrice(double mPrice) {
		this.mPrice = mPrice;
	}

}
