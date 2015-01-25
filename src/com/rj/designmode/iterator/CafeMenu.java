package com.rj.designmode.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

	Hashtable<String, MenuItem> mMenuItems = new Hashtable<String, MenuItem>();

	public CafeMenu() {
		
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return mMenuItems.values().iterator();
	}

	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		mMenuItems.put(menuItem.getmName(), menuItem);
	}
	
	
}
