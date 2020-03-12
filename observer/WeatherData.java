package com.headfirst.designpatterns.observer;
import java.util.Observable;
import java.util.Observer;

import java.util.ArrayList;

//public class WeatherData implements Subject{
public class WeatherData extends Observable{
    //private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        //observers = new ArrayList();
    }

    /*public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    public void notifyObservers(){
        for(int i = 0; i < observers.size();i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }*/

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature(){
        return this.temperature;
    }

    public float gethumidity(){
        return this.humidity;
    }

    public float getPressure(){
        return this.pressure;
    }
}