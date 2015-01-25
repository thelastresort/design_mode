package com.rj.designmode.command;

public class GarageDoor {
	
	public void up() {
		System.out.println("Garage Door is Opened");
	}

	public void down() {
		System.out.println("Garage Door is Down");
	}

	public void stop() {
		System.out.println("Garage Door is stop");
	}

	public void lightOn() {
		System.out.println("Garage Door is lightOn");
	}

	public void lightOff() {
		System.out.println("Garage Door is lightOff");
	}
}
