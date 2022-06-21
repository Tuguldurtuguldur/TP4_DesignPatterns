package Exercice2;

import java.util.ArrayList;

public class WeatherData implements Subject
{
    private ArrayList<Observer> observers = new ArrayList<>();
    private double temperature;
    private double pressure;
    private double humidity;

    public void registerObserver(Observer o)
    {
        this.observers.add(o);
    }
    public void removeObserver(Observer o)
    {
        this.observers.remove(o);
    }

    public void notifyObservers()
    {
        System.out.println("notify observers");

        for(Observer o : this.observers)
        {
            o.update(this.temperature, this.pressure, this.humidity);
        }
    }

    public void setTemperature(double t)
    {
        if(t != this.temperature)
        {
            this.temperature = t;
            measurementChanged();
        }
    }

    public void setPressure(double p)
    {
        if(p != this.pressure)
        {
            this.pressure = p;
            measurementChanged();
        }
    }

    public void setHumidity(double h)
    {
        if(h != this.humidity)
        {
            this.humidity = h;
            measurementChanged();
        }
    }
    public void measurementChanged()
    {
        this.notifyObservers();
    }
}
