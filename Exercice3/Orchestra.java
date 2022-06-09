package Exercice3;
import java.util.ArrayList;

public class Orchestra
{
    private ArrayList<Instrument> Instruments;

    public Orchestra()
    {
        this.Instruments = new ArrayList<>();
    }

    public void addInstrument(Instrument instrument)
    {
        this.Instruments.add(instrument);
    }

    public void tune(Instrument instrument)
    {
        instrument.play();
    }


    public void tuneTenor(Soloist i)
    {
        i.playLikeATenor();
    }

    public void tuneSoprano(Soloist i)
    {
        i.playLikeASoprano();
    }

    public void tuneAll()
    {
        for (int i = 0; i < this.Instruments.size(); i++)
        {
            this.Instruments.get(i).play();
        }
    }



}
