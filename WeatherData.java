package com.rifatiqbal.observer_pattern;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (Observer currentObserver : observers) {
			currentObserver.update(temperature, humidity, pressure);	
		}
	}
	
	public void meaurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temprature, float humidity, float pressure) {
		this.temperature = temprature;
		this.humidity = humidity;
		this.pressure = pressure;
		meaurementsChanged();
	}
}
