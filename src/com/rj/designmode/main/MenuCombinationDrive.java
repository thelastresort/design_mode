package com.rj.designmode.main;

import com.rj.designmode.combination.Menu;
import com.rj.designmode.combination.MenuComponent;
import com.rj.designmode.combination.MenuItem;
import com.rj.designmode.combination.Waitress;

public class MenuCombinationDrive {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MEN", "Dinner");
		MenuComponent dessertMenu= new Menu("DESSERT MENU", "Dessert of course!");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat",true, 2.99));
		dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
		dinerMenu.add(dessertMenu);
		
		pancakeHouseMenu.add(new MenuItem("Soup of the day", "Soup of the day,  with a side of potato salad", false, 3.29));
		pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
		pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and toast", false, 2.99));
		
		cafeMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes with fried eggs, and sausage", false, 3.49));
		cafeMenu.add(new MenuItem("Waffles", "Waffles, with your choise of blueberries or strawberries", true, 3.59));
		cafeMenu.add(new MenuItem("Hotdog", "A hot dog,  with saurkraut, relish, onions, topped, with cheese", false, 3.05));
		
		Waitress waitress = new Waitress(allMenus);
		
		waitress.printMenu();
		waitress.printVegetarianMenu();
	}
}
