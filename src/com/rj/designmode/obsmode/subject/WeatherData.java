package com.rj.designmode.obsmode.subject;

import java.util.ArrayList;

import com.rj.designmode.obsmode.obs.Observer;

public class WeatherData implements Subject
{
	private ArrayList<Observer> observers;
	private float mTemperator;
	private float mHumidity;
	private float mPressure;

	public WeatherData()
	{
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o)
	{
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o)
	{
		observers.remove(o);
	}

	@Override
	public void notifyObservers()
	{
		for (Observer observer : observers)
		{
			observer.update(mTemperator, mHumidity, mPressure);
		}
	}

	public void measurementsChanged()
	{
		notifyObservers();
	}
	
	public void setMeasureMents(float temp, float hum, float pressure)
	{
		mTemperator = temp;
		mHumidity = hum;
		mPressure = pressure;
		measurementsChanged();
	}
	
}
