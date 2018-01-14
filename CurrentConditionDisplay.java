package com.rifatiqbal.observer_pattern;

public class CurrentConditionDisplay implements Observer {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temprature, float humidity, float pressure) {
		this.temperature = temprature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
