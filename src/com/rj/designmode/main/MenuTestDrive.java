package com.rj.designmode.main;

import com.rj.designmode.iterator.CafeMenu;
import com.rj.designmode.iterator.DinerMenu;
import com.rj.designmode.iterator.PancakeHouseMenu;
import com.rj.designmode.iterator.Waitress;

public class MenuTestDrive {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
		
		waitress.printMenu();
	}
}
