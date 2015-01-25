package com.rj.designmode.state;

public class GumballMachineOld {
	private final static int SOLD_OUT = 0;
	private final static int NO_QUARTER = 1;
	private final static int HAS_QUARTER = 2;
	private final static int SOLD = 3;

	private int state = SOLD_OUT;
	int count = 0;

	public GumballMachineOld(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}

	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			out("You can't insert another quarter");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			out("You inserted a quarter");
		} else if (state == SOLD_OUT) {
			out("You can't insert a quarter, the machine is sold out");
		} else if (state == SOLD) {
			out("Please wait, we're already giving you a gumbal");
		}
	}

	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			out("Quarter returned");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			out("You haven't inserted a quarter");
		} else if (state == SOLD) {
			out("Sorry, you already turned the crank");
		} else if (state == SOLD_OUT) {
			out("You can't eject, you haven't inserted a quarter yet");
		}
	}

	public void turnCrank() {
		if (state == SOLD) {
			out("Turning twice doesn't get you another gumball!");
		} else if (state == NO_QUARTER) {
			out("You turned but there's no quarter");
		} else if (state == SOLD_OUT) {
			out("You turned, but there are no gumballs");
		} else if (state == HAS_QUARTER) {
			out("You turned...");
			state = SOLD;
			despense();
		}
	}

	public void despense() {
		if (state == SOLD) {
			out("A gumball comes rolling out the slot");
			count--;
			if (count == 0) {
				out("Oops, out of gumballs!");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			out("You need to pay first");
		} else if (state == SOLD_OUT) {
			out("No gumball dispensed");
		} else if (state == HAS_QUARTER) {
			out("No gumball dispensed");
		}
	}

	private void out(String s) {
		System.out.println(s);
	}
	
	@Override
	public String toString() {
		String result = "";
		if (state == SOLD) {
			result = "SOLD";
		} else if (state == NO_QUARTER) {
			result = "NO_QUARTER";
		} else if (state == SOLD_OUT) {
			result = "SOLD_OUT";
		} else if (state == HAS_QUARTER) {
			result = "HAS_QUARTER";
		}
		return result;
	}
}
