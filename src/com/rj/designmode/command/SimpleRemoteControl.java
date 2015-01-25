package com.rj.designmode.command;

public class SimpleRemoteControl {
	Command mSlot;
	
	public SimpleRemoteControl(){}
	
	public void setCommand(Command command)
	{
		mSlot = command;
	}
	
	public void buttonWasPress(){
		mSlot.execute();
	}
}
