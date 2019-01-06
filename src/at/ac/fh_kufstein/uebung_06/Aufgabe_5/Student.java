package at.ac.fh_kufstein.uebung_06.Aufgabe_5;

public class Student
{
    private String name;
    private int matrikel;
    private int jahrgang;

    public Student(String name, int matrikel, int jahrgang)
    {
        this.name = name;
        this.matrikel = matrikel;
        this.jahrgang = jahrgang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatrikel() {
        return matrikel;
    }

    public void setMatrikel(int matrikel) {
        this.matrikel = matrikel;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }

    @Override
    public String toString() {
        return "Mein Name ist " + getName() + " und ich habe die Matrikelnummer " + getMatrikel() + ". Ich bin im Jahrgang "  + getJahrgang();
    }
}
