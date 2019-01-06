package at.ac.fh_kufstein.uebung_06.Aufgabe_5;

import java.util.ArrayList;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args)
    {
        List<Student> studenten = new ArrayList<>();

        studenten.add(new Student("Larissa",  1810653996, 2018));
        studenten.add(new Student("Magdalena", 1810653784, 2018));
        studenten.add(new Student("Matteo", 1810653484, 2018));

        for(Student s: studenten)
        {
            System.out.println(s);
        }
    }
}
