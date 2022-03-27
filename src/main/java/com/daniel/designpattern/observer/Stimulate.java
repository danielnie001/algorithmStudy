package com.daniel.designpattern.observer;

import com.daniel.designpattern.observer.inteface.Observer;
import com.daniel.designpattern.observer.inteface.impl.CurrentConditionsDisplay;
import com.daniel.designpattern.observer.inteface.impl.WeatherData;

/**
 * @author Admin
 * @date 2022/3/26 21:18
 * @description algorithm
 * @className Stimulate.java
 * @motto Talk is cheap. Show me the code.
 */
public class Stimulate {

    public static void main(String[] args) {
        // new 实例
        WeatherData weatherData = new WeatherData();
        // 注册至subject中
        Observer observer = new CurrentConditionsDisplay(weatherData);
        weatherData.serMeasurements(80, 65, 30.4f);
        weatherData.serMeasurements(82, 70, 29.2f);
        weatherData.serMeasurements(78, 90, 29.2f);
    }

}
