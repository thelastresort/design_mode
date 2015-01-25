package com.rj.designmode.command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("No Command");
	}

}
