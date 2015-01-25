package com.rj.designmode.iterator;

import java.util.Iterator;

public class Waitress {
	Menu mPancakeHouseMenu;
	Menu mDinerMenu;
	Menu mCafeMenu;
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu){
		mPancakeHouseMenu = pancakeHouseMenu;
		mDinerMenu = dinerMenu;
		mCafeMenu = cafeMenu;
	}
	
	public void printMenu(){
		Iterator<MenuItem> pancakeIterator = mPancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinner = mDinerMenu.createIterator();
		Iterator<MenuItem> cafe = mCafeMenu.createIterator(); 
		
		System.out.println("MENU\n---\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinner);
		System.out.println("\nCAFE");
		printMenu(cafe);
		
	}
	
	private void printMenu(Iterator<MenuItem> iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getmName() + ", " + menuItem.getmPrice() + " -- " + menuItem.getmDescription());
		}
	}
}
