import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    //Klasa klient klient ma w sobie id, liste zakupow


    public static void main(String[] args) {
//        Sklep s = new Sklep("nazwa");
//        ArrayList<Klient> klienci = new ArrayList<>();
//        Klient k = new Klient(1);
//        k.dodajProdukt(new Produkt("a",10,"b"));
//        k.dodajProdukt(new Produkt("a",10,"b"));
//        k.dodajProdukt(new Produkt("a",10,"b"));
//        klienci.add(k);
//        s.setListaKlientow(klienci);
//
//
//
//        System.out.println(s.sumaWartosciProduktowKlienta(klienci.get(0)));

        Sklep s = new Sklep("nazwa");
        //s.stworzKlienta();
        int id = 1;
        Klient k = new Klient(id);
        s.dodajKlienta(k);
        s.wyswietlProdukty();




        //Komendy
        //Wyjdz ze sklepu
        // Wypisz produkty
        // Dodaj produkt do koszyka

        //Stworz petle, jezeli ktos wpisze 0 to program sie przerywa, jezeli ktos wpisze 1 to wypisza sie produkty ze sklepu
        Scanner sc = new Scanner(System.in);


        boolean flaga = true;
        while(flaga)
        {
            System.out.println("Podaj komende");
            int komenda = sc.nextInt();
            if(komenda == 0)
            {
                flaga = false;
            }
            else if(komenda == 1)
            {
                s.wyswietlProdukty();
            }
            else if(komenda == 2)
            {
                // Zeby dodaj cos do koszyka to musimy znac nazwe tego produktu, albo index
                // Potrzebujemy klienta oraz produktu
                System.out.println("Podaj nazwe produktu do dodania do koszyka");
                String nazwaProduktu = sc.next();
                Produkt produkt = s.znajdzProduktPoNazwie(nazwaProduktu);
                if(produkt == null)
                {
                    System.out.println("Brak takiego produktu");
                }
                else{
                    // Dodaj produkt do listy klienta

                    //Znajdz klienta za pomoca id
                    for(Klient k1 : s.getListaKlientow())
                    {
                        if(k1.equals(k))
                        {
                            k1.dodajProdukt(produkt);

                        }
                    }
                }








            }
        }


    }
}
