package at.ac.fh_kufstein.uebung_06.aufgabe4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe_4
{
    public static void main(String[] args)
    {
        //Liste erstellen
        List<Freunde> meineFreunde = new ArrayList<>(); //array list mit freunden erstellen

        for (int i = 1; i <= 5; i++)
        {
           meineFreunde.add(new Freunde(JOptionPane.showInputDialog(i + ". Freund eingeben"))); //in einer schleife die 5 freunde abfragen und hinzufügen zu meiner array liste
        }


        System.out.println("Meine Freunde heißen: " + meineFreunde); //liste ausgeben



    }
}
