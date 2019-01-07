package at.ac.fh_kufstein.uebung_06;

import javax.swing.*;
import java.util.Random;

public class Aufgabe_3
{

    public static void main(String[] args)
    {
        int[] array = new int[100];


        Random zufall = new Random();



        //zum befüllen                //rnd.nextInt(max - min + 1) + min
        for (int i = 0; i < array.length; i++)
        {
            array[i] = zufall.nextInt(300);

        }
        /*zum ausgeben
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }*/

        while(true) //solange das zutrifft --> gibt man keine zahl ein stürzt das programm ab
        {

            int position = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib die Stelle an, an der du die Zahl ändern möchtest: "));
            JOptionPane.showMessageDialog(null, "Der Wert an der " + position + ". Stelle ist: " + array[position]);

            int newValue = Integer.parseInt(JOptionPane.showInputDialog("Bitte neuen Wert eingeben: "));
            array[position] = newValue;

            JOptionPane.showMessageDialog(null, "Der neue Wert an der " + position + ". Stelle ist: " + array[position]);
        }


    }






}
