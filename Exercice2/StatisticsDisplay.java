package Exercice2;

public class StatisticsDisplay implements Observer, DisplayMeasurements
{
    public void display() {
        System.out.println("StatisticsDisplay has been updated");
    }
    public void update(double T, double P, double H) {
        this.display();
    }
}
