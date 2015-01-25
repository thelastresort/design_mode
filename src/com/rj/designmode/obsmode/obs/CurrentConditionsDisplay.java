package com.rj.designmode.obsmode.obs;

import com.rj.designmode.obsmode.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement
{
	private float mTemperature;
	private float mHumidity;
	private Subject mWeatherData;

	public CurrentConditionsDisplay(Subject weatherData)
	{
		mWeatherData = weatherData;
		mWeatherData.registerObserver(this);
	}
	
	@Override
	public void display()
	{
		System.out.println("Current conditions: " + mTemperature + "F degrees and " + mHumidity + "% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure)
	{
		mTemperature = temp;
		mHumidity = humidity;
		display();
	}

}
