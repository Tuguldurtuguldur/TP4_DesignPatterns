package Exercice3;

public class Music
{
    public static void main (String[] args) {

        Orchestra orchestra = new Orchestra();
        Flute flute = new Flute();
        Percussion percussion= new Percussion();
        Violin violin = new Violin();
        Guitar guitar = new Guitar();
        Trombone trombone = new Trombone();

        orchestra.addInstrument(flute);
        orchestra.addInstrument(percussion);
        orchestra.addInstrument(violin);
        orchestra.addInstrument(guitar);
        orchestra.addInstrument(trombone);

        orchestra.tuneTenor(guitar);
        orchestra.tuneTenor(trombone);
        orchestra.tuneSoprano(flute);
        orchestra.tuneSoprano(violin);
        orchestra.tuneSoprano(guitar);
        orchestra.tuneAll();

    }
}
