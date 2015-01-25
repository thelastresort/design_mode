package com.rj.designmode.combination;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	ArrayList<MenuComponent> mMenuComponents = new ArrayList<MenuComponent>();
	String mName;
	String mDescription;

	public Menu(String name, String description) {
		mName = name;
		mDescription = description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		mMenuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		mMenuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return mMenuComponents.get(i);
	}

	@Override
	public String getName() {
		return mName;
	}

	@Override
	public String getDescription() {
		return mDescription;
	}
	
	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("----------------------");
		
		Iterator<MenuComponent> iterator = mMenuComponents.iterator();
		while(iterator.hasNext()){
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
		
	}
	
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new CompositeIterator(mMenuComponents.iterator());
	}
}
