package com.rj.designmode.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
	ArrayList<MenuItem> mMenuItems;

	public PancakeHouseMenu() {
		mMenuItems = new ArrayList<MenuItem>();

		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and toast", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes with fried eggs, and sausage", false, 3.49);
		addItem("Waffles", "Waffles, with your choise of blueberries or strawberries", true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		mMenuItems.add(menuItem);
	}

	public ArrayList<MenuItem> getMenuItems() {
		return mMenuItems;
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return mMenuItems.iterator();
	}
}
