package at.ac.fh_kufstein.uebung_06;

import javax.swing.*;
import java.util.Random;

public class Aufgabe_2
{
    public static void main(String[] args)
    {
        int azahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib eine Zahl ein:"));
        int[] array = new int[azahl]; //neues array mit der größe des Benutzers erstellen

        Random zufallszahl = new Random();

        for (int i = 0; i < array.length; i++) //statt array.length könnte ich auch azahl nehmen --> dieselbe zahl
        {
           array[i] = zufallszahl.nextInt(1000); //zufallszahl definieren und sofort auf die array speichern
                                            //1000 weil das die höchste Zahl sein soll
                                            //r*(max-min)+min --> max 1000 min 0


        }

        for(int i = array.length-1; i >= 0; i--) //umgekehrte Reihenfolge: beginne beim höchsten platz und gehe bis 0
            //-1 da index bei 0 zählen beginnt und die länge aber bei 1
        {
            System.out.println(array[i]); //warum -1?
        }


    }
}
