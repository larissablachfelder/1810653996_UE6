package at.ac.fh_kufstein.uebung_06.aufgabe_3_v2;

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
        int eingabe = 0;

        while(true) //solange das zutrifft, trifft etwas anderes zu passiert nichts

        {

            String position = JOptionPane.showInputDialog("Bitte gib die Stelle an, an der du die Zahl ändern möchtest: ");

            if(NumericCheck.isNumeric(position))
            {
                eingabe = Integer.parseInt(position);
            }

            else
            {
                break;
            }

            JOptionPane.showMessageDialog(null, "Der Wert an der " + eingabe + ". Stelle ist: " + array[eingabe]);

            int newValue = Integer.parseInt(JOptionPane.showInputDialog("Bitte neuen Wert eingeben: "));
            array[eingabe] = newValue;

            JOptionPane.showMessageDialog(null, "Der neue Wert an der " + eingabe + ". Stelle ist: " + array[eingabe]);


        }


    }
}
