package com.rj.designmode.obsmode.subject;

import com.rj.designmode.obsmode.obs.Observer;

public interface Subject
{
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
