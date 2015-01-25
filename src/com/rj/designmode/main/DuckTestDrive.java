package com.rj.designmode.main;

import com.rj.designmode.adapter.TurkeyAdapter;
import com.rj.designmode.adapter.WildTurkey;
import com.rj.designmode.duck.Duck;
import com.rj.designmode.duck.MallardDuck;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck  = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says....");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says....");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter sys....");
		testDuck(turkeyAdapter);
	}
	
	private static void testDuck(Duck duck){
		duck.peformQuack();
		duck.peformFly();
	}
}
