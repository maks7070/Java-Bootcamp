import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sklep
{
    //1. Dodajecie produkty do koszyka
    //2. Płatnosc:
    //2.1 Cena wszystkich produktow
    //2.2 Sprawdzenie czy mamy wystarczajaco pieniedzy
    //2.3 Platnosc do sklepu
    //3. clear koszyk




    private static HashMap<String, Double> produktyWSklepie = new HashMap<> ();
    private static ArrayList<String> koszyk = new ArrayList<> ();
    private static int iloscPieniedzy = 60;

    public static void dodajProduktDoKoszyka(String nazwa)
    {
        if(produktyWSklepie.containsKey(nazwa))
        {
            koszyk.add(nazwa);
            usunProduktWSklepie(nazwa);
            System.out.println("Produkt zostal dodany do koszyka");
        }
        else{
            System.out.println("Tego produktu nie ma w sklepie");
        }

    }
    public static void usunProduktWSklepie(String nazwa)
    {
        produktyWSklepie.remove(nazwa);
    }

    public static double cenaProduktow()
    {
        double suma = 0;
        if(koszyk.size() == 0)
        {
            return 0;
        }
        else{
            for(String nazwa: koszyk)
            {
                suma += produktyWSklepie.get(nazwa);
            }
            return suma;
        }
    }

    public static void dodajProduktyDoSklepu()
    {
        produktyWSklepie.put("produkt1",15.00);
        produktyWSklepie.put("produkt2",20.00);
        produktyWSklepie.put("produkt3",30.00);
        produktyWSklepie.put("produkt4",20.00);
        produktyWSklepie.put("produkt5",25.00);
    }

    public static void usunKoszyk()
    {
        koszyk.clear();
    }
    public static void wypiszProduktyWSklepie()
    {
        for(String s: produktyWSklepie.keySet())
        {
            System.out.println("Nazwa: " + s + ", cena: " + produktyWSklepie.get(s));
        }
    }




    public static void main(String[] args) {
        dodajProduktyDoSklepu ();
        boolean flaga = true;
        System.out.println("Sklep");
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);




        while(flaga)
        {
            String komenda = sc.next();
            if(komenda.equals("kup"))
            {
                System.out.println("Podaj nazwe produktu");
                dodajProduktDoKoszyka(sc.next());

            }
            else if(komenda.equals("kwota"))
            {
                System.out.println("Produkty kosztuja: " + cenaProduktow());
            }
            else if(komenda.equals("produkty"))
            {
                wypiszProduktyWSklepie();
            }
            else if(komenda.equals("plac"))
            {
                if(cenaProduktow() > iloscPieniedzy)
                {
                    System.out.println("Brak wystarczajacych srodkow");
                }
                else{
                    System.out.println("Zakupy pomyslne");
                    usunKoszyk();
                    flaga = false;
                }

            }



        }












    }
}
