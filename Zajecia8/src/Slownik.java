import java.util.HashMap;

public class Slownik
{

    // klucz - definice
    // klucz - wartosc


    public static void main(String[] args) {
        HashMap<String,String> stolice = new HashMap<> ();
        stolice.put ("Polska","Warszawa");
        stolice.put ("Anglia","Londyn");
        stolice.put ("Francja","Paryz");
        stolice.put ("Niemcy","Berlin");



        System.out.println (stolice);
//        stolice.get ("Polska");
//        stolice.remove ("Polska");
//        stolice.clear ();
//        stolice.size ();

        for(String s: stolice.keySet ())
        {
            System.out.println (s);
            //String tmp = stolice.get (s);
        }




        // "Klucz:" kluczzMapy, Wartosc: wartosczMapy



    }
}
