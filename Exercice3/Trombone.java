package Exercice3;

public class Trombone extends Brass implements Soloist
{
    public void playLikeATenor()
    {
        System.out.println("Trombone plays like a Tenor");
    }

    public void playLikeASoprano()
    {
        System.out.println("Trombone cannot play like a Soprano");
    }

    public void play()
    {
        System.out.println("Trombone plays like an Instrument");
    }
}
