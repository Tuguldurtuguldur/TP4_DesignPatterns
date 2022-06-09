package Exercice1;

import java.util.ArrayList;

public class Orchestra
{
    private ArrayList<Wind> wind;
    private ArrayList<Percussion> percussion;

    public Orchestra()
    {
        this.wind = new ArrayList<>();
        this.percussion = new ArrayList<>();
    }

    public void tuneWind(Wind wind)
    {
        wind.play();
    }

    public void tunePercussion(Percussion percussion)
    {
        percussion.play();
    }

    public void tuneAll()
    {
        for(int i = 0; i <this.wind.size();i++)
        {
            this.wind.get(i).play();
        }
        for(int i = 0; i <this.percussion.size();i++)
        {
            this.percussion.get(i).play();
        }
    }
    public  void addWind(Wind newWind)
    {
        this.wind.add(newWind);
    }
    public  void addPercussion(Percussion newPercussion)
    {
        this.percussion.add(newPercussion);
    }
}