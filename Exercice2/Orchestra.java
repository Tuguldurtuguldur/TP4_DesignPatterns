package Exercice2;
import java.util.ArrayList;

public class Orchestra
{
    private ArrayList<Instrument> instrument;

    public void addInstrument(Instrument instrument)
    {
        this.instrument.add(instrument);
    }

    public Orchestra()
    {
        this.instrument = new ArrayList<>();
    }

    public void tune(Instrument instrument)
    {
        instrument.play();
    }
    public void tuneAll()
    {
        for(int i = 0; i < this.instrument.size(); i++)
        {
            this.instrument.get(i).play();
        }
    }



}
