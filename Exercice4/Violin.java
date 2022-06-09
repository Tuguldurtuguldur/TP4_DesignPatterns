package Exercice4;


public class Violin extends Stringed implements Soprano
{
    public void play(){
        System.out.println("Violin plays like an Instrument");
    }

    public void playLikeASoprano()
    {
        System.out.println("Violin plays like a Soprano");
    }
}
