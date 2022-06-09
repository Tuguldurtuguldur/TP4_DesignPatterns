package Exercice3;

public class Flute extends Woodwind implements Soloist
{
    public void play()
    {
        System.out.println("Flute plays like an Instrument");
    }

    public void playLikeATenor()
    {
        System.out.println("Flute cannot play like a Tenor");
    }

    public void playLikeASoprano()
    {
        System.out.println("Flute plays like a Soprano");
    }

}
