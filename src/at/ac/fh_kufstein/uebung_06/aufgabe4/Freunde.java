package at.ac.fh_kufstein.uebung_06.aufgabe4;

public class Freunde
{
    private String name;

    public Freunde(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() //toString überschreiben um eine schöne Formatierung untereinander mit Trennabschnitten zu bekommen
    {
        return "\n " + this.name + "\n_____________\n";
    }
}
