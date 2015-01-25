package com.rj.designmode.obsmode.obs;

import java.util.ArrayList;

import com.rj.designmode.obsmode.subject.Subject;

public class StatisticsDisplay implements DisplayElement, Observer
{

	private ArrayList<Float> mTemperatures;
	private ArrayList<Float> mHumiditys;
	private ArrayList<Float> mPressures;

	private Subject mWeatherData;

	public StatisticsDisplay(Subject weatherData)
	{
		mWeatherData = weatherData;
		mTemperatures = new ArrayList<Float>();
		mHumiditys = new ArrayList<Float>();
		mPressures = new ArrayList<Float>();
		mWeatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure)
	{
		mTemperatures.add(temp);
		mHumiditys.add(humidity);
		mPressures.add(pressure);
		display();
	}

	@Override
	public void display()
	{
		System.out.println("Temperature/Humidity/Pressure Average：" + calculateAverge(mTemperatures) + "/"
				+ calculateAverge(mHumiditys) + "/" + calculateAverge(mPressures));
	}

	private float calculateAverge(ArrayList<Float> datas)
	{
		float result = 0;
		for (Float data : datas)
		{
			result += data;
		}
		return result / datas.size();
	}
}
