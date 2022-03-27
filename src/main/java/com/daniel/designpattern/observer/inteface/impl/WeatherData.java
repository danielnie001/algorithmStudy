package com.daniel.designpattern.observer.inteface.impl;

import com.daniel.designpattern.observer.inteface.Observer;
import com.daniel.designpattern.observer.inteface.Subject;

import java.util.ArrayList;

/**
 * @author Admin
 * @date 2022/3/26 21:02
 * @description algorithm
 * @className WeatherData.java
 * @motto Talk is cheap. Show me the code.
 */
public class WeatherData implements Subject {

    private final ArrayList observers;
    private float humidity;
    private float temperature;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void serMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
