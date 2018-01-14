package com.rifatiqbal.observer_pattern;

public class WeatherApplication {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(30, 40, 50);
	}
}
