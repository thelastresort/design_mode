package com.rj.designmode.combination;

import java.util.Iterator;

public class Waitress {
	MenuComponent mAllMenus;

	public Waitress(MenuComponent menus) {
		this.mAllMenus = menus;

	}

	public void printMenu() {
		mAllMenus.print();
	}

	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = mAllMenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n-----");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {
//				e.printStackTrace();
			}
		}
	}
}
