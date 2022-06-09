package Exercice3;

public class Violin extends Stringed implements Soloist
{
    public void playLikeATenor()
    {
        System.out.println("Violin cannot play like a Tenor");
    }

    public void playLikeASoprano()
    {
        System.out.println("Violin plays like a Soprano");
    }

    public void play()
    {
        System.out.println("Violin plays like an Instrument");
    }
}
