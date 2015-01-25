package com.rj.designmode.state;

public class WinnerState implements State{
	GumballMachine mGumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		mGumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void ejectQuarter() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void turnCrank() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void dispense() {
		System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
		mGumballMachine.releaseBall();
		if(mGumballMachine.getCount() == 0){
			mGumballMachine.setState(mGumballMachine.getSoldOutState());
		}else{
			mGumballMachine.releaseBall();
			if(mGumballMachine.getCount() > 0){
				mGumballMachine.setState(mGumballMachine.getNoQuarterState());
			}else{
				System.out.println("Oops, out of gumballs!");
				mGumballMachine.setState(mGumballMachine.getSoldOutState());
			}
		}
	}

}
