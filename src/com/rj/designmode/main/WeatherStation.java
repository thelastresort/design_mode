package com.rj.designmode.main;

import com.rj.designmode.obsmode.obs.CurrentConditionsDisplay;
import com.rj.designmode.obsmode.obs.StatisticsDisplay;
import com.rj.designmode.obsmode.subject.WeatherData;

public class WeatherStation
{
	public static void main(String[] args)
	{
		WeatherData weatherData = new WeatherData();

		new CurrentConditionsDisplay(weatherData);
		new StatisticsDisplay(weatherData);

		weatherData.setMeasureMents(80, 65, 30.4f);
		weatherData.setMeasureMents(82, 70, 29.2f);
		weatherData.setMeasureMents(78, 90, 29.4f);

	}
}
