package Exercice2;

public class CurrentConditionsDisplay implements Observer, DisplayMeasurements
{
    private double temperature;
    private double pressure;
    private double humidity;

    public void display()
    {
        System.out.println("temp = " + this.temperature + ", pressure = " + this.pressure + ", humidity = " + this.humidity);
    }


    public void update(double T, double P, double H)
    {
        System.out.print("CurrentConditionsDisplay has been updated: ");
        this.temperature = T;
        this.pressure = P;
        this.humidity = H;
        this.display();
    }
}