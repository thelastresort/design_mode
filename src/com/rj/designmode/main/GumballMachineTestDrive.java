package com.rj.designmode.main;

import com.rj.designmode.state.GumballMachineOld;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		GumballMachineOld gumballMachine = new GumballMachineOld(5);
		
		out(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		out(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		
		out(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuarter();
		
		out(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		out(gumballMachine);
	}

	private static void out(Object s) {
		System.out.println(s.toString());
	}
}
