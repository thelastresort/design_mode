package com.rj.designmode.command;

public class LightOffCommand implements Command{

	Light mLight;
	
	public LightOffCommand(Light light) {
		mLight = light;
	}
	@Override
	public void execute() {
		mLight.off();
	}

}
