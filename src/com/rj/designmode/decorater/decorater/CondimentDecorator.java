package com.rj.designmode.decorater.decorater;

import com.rj.designmode.decorater.decorated.Beverage;

public abstract class CondimentDecorator extends Beverage 
{
	public abstract String getDescription();
}
