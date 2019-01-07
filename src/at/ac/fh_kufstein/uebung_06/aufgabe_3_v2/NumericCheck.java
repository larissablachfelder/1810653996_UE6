package at.ac.fh_kufstein.uebung_06.aufgabe_3_v2;

public class NumericCheck
{
    public static boolean isNumeric(String value)
    {
        try { //versuche das...
            int number = Integer.parseInt(value);
            return true;
        }

        catch(NumberFormatException e ) //ansonsten das...
        {
            return false;
        }
    }
}

//Methode wird String übergeben
//versucht String in Int umzuwandeln
//wenns funktioniert wird true zurückgeliefert ansonsten schmeißt er eine exception und liefert false
//exception sind ausnahmebedingungen