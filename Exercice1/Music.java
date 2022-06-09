package Exercice1;

public class Music
{
    public static void main(String[] args)
    {
        Orchestra o = new Orchestra();

        Percussion percussion = new Percussion();
        Wind wind = new Wind();
        Woodwind woodwind = new Woodwind();
        Brass brass = new Brass();
        
        o.addWind(wind);
        o.addPercussion(percussion);
        o.addWind(woodwind);
        o.addWind(brass);

        o.tuneWind(wind);
        o.tuneWind(brass);
        o.tunePercussion((percussion));
        o.tuneWind(woodwind);
    }
}
