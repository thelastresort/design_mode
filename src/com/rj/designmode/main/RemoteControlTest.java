package com.rj.designmode.main;

import com.rj.designmode.command.GarageDoor;
import com.rj.designmode.command.GarageDoorOpenCommand;
import com.rj.designmode.command.Light;
import com.rj.designmode.command.LightOnCommand;
import com.rj.designmode.command.SimpleRemoteControl;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageUp = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(lightOn);
		remote.buttonWasPress();
		
		remote.setCommand(garageUp);
		remote.buttonWasPress();
	}
}
