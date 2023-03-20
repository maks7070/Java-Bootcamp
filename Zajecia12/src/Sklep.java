import java.util.ArrayList;
import java.util.Scanner;

public class Sklep
{
    // nazwa sklepu, liste klientow, lista produktow

    private String nazwaSklepu;
    private ArrayList<Klient> listaKlientow;
    private ArrayList<Produkt> listaProduktow;
    private int pieniadzeWSklepie;

    public Sklep(String nazwaSklepu)
    {
        this.nazwaSklepu = nazwaSklepu;
        listaKlientow = new ArrayList<>();
        listaProduktow = new ArrayList<>();
        pieniadzeWSklepie = 0;
        dodajProdukty();
    }


    public void dodajProdukty()
    {
        Produkt p1 = new Produkt("n1",1,"a");
        Produkt p2 = new Produkt("n2",2,"a");
        Produkt p3 = new Produkt("n3",3,"a");
        Produkt p4 = new Produkt("n4",4,"b");
        Produkt p5 = new Produkt("n5",5,"b");
        Produkt p6 = new Produkt("n6",6,"b");
        Produkt p7 = new Produkt("n7",7,"c");
        Produkt p8 = new Produkt("n8",8,"c");
        Produkt p9 = new Produkt("n9",9,"c");
        Produkt p10 = new Produkt("n10",10,"c");

        listaProduktow.add(p1);
        listaProduktow.add(p2);
        listaProduktow.add(p3);
        listaProduktow.add(p4);
        listaProduktow.add(p5);
        listaProduktow.add(p6);
        listaProduktow.add(p7);
        listaProduktow.add(p8);
        listaProduktow.add(p9);
        listaProduktow.add(p10);










    }


    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        this.nazwaSklepu = nazwaSklepu;
    }

    public ArrayList<Klient> getListaKlientow() {
        return listaKlientow;
    }

    public void setListaKlientow(ArrayList<Klient> listaKlientow) {
        this.listaKlientow = listaKlientow;
    }

    public ArrayList<Produkt> getListaProduktow() {
        return listaProduktow;
    }

    public void setListaProduktow(ArrayList<Produkt> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }



    //Funkcja ktora dodaje oraz tworzy nowego klienta w sklepie za pomoca skanera
    // Sprawdzcie czy nie ma takiego klienta ktory ma juz taki numer id



    public boolean czyKlientIstnieje(int id)
    {
        boolean flaga = false;
        if(listaKlientow.size() == 0)
        {
            flaga = true;
        }
        else{
            for(Klient k: listaKlientow)
            {
                if(k.getId() == id)
                {
                    flaga = true;
                }
            }

        }
        return flaga;
    }


    public void stworzKlienta()
    {
        System.out.println("Podaj id");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        boolean flag = true;

        while(flag)
        {
            if(!czyKlientIstnieje(id))
            {
                //Dodajemy klienta
                listaKlientow.add(new Klient(id));
                System.out.println("Klient dodany");
                flag = false;
            }
            else{
                System.out.println("Podaj inne id");
                id = sc.nextInt();
            }
        }
    }

    //Funkcja ktora sumuje kwote pieniedzy w koszyku klienta


    public int sumaWartosciProduktowKlienta(Klient klient)
    {
        ArrayList<Produkt> produkty = klient.getListaProduktow();
        int suma = 0;
        for(Produkt p : produkty)
        {
            suma += p.getCena();
        }

        return suma;
    }


    public void wyswietlProdukty()
    {
        for(Produkt p: listaProduktow)
        {
            p.wypisz();
        }
    }


    public Produkt znajdzProduktPoNazwie(String nazwa)
    {
        int liczba = -1;
        for(int i = 0; i < listaProduktow.size();i++)
        {
            if(listaProduktow.get(i).getNazwa().equals(nazwa))
            {
                liczba = i;
                break;
            }
        }
        if(liczba == -1)
        {
            return null;
        }
        else{
            return listaProduktow.get(liczba);
        }

    }



    public void dodajKlienta(Klient klient)
    {
        listaKlientow.add(klient);
    }






}
