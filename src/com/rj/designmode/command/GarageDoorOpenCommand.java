package com.rj.designmode.command;

public class GarageDoorOpenCommand implements Command {

	private GarageDoor mGarageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		mGarageDoor = garageDoor;
	}

	@Override
	public void execute() {
		mGarageDoor.up();
	}

}
