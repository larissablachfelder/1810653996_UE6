package at.ac.fh_kufstein.uebung_06.Aufgabe_4;

public class Freunde
{
    private String name;

    public Freunde(String name) //Konstruktor
    {
        this.name = name;
    }

    @Override
    public String toString() //toString überschreiben um eine schöne Formatierung untereinander mit Trennabschnitten zu bekommen
    {
        return "\n " + this.name + "\n_____________\n";
    }
}
