package com.rj.designmode.command;

public class LightOnCommand implements Command {

	Light mLight;

	public LightOnCommand(Light light) {
		mLight = light;
	}

	@Override
	public void execute() {
		mLight.on();
	}

}
