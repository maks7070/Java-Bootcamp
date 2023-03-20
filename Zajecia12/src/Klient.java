import java.util.ArrayList;

public class Klient
{
    private int id;
    private ArrayList<Produkt> listaProduktow;



    public Klient(int id)
    {
        this.id = id;
        listaProduktow = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public ArrayList<Produkt> getListaProduktow() {
        return listaProduktow;
    }

    public void setListaProduktow(ArrayList<Produkt> listaProduktow)
    {
        this.listaProduktow = listaProduktow;
    }

    public void dodajProdukt(Produkt produkt)
    {
        listaProduktow.add(produkt);
        System.out.println("Produkt zostal dodany do koszyka");
        System.out.println(listaProduktow);
    }


    //Napisac funkcje ktora usunie dany produkt z koszyka trzeba podac int

    public void usunProdukt(int index)
    {
        listaProduktow.remove(index);
        System.out.println("Produkt zostal usuniety z koszyka");
        System.out.println(listaProduktow);
    }





    //Klasa produkt ma nazwe produktu, cene oraz kategorie



    public void wypiszInformacjeKlienta()
    {
        System.out.println("Id klienta: " + id);
        System.out.println("Koszyk klienta");


        int licznik = 1;
        for(Produkt p: listaProduktow)
        {
            System.out.print(licznik + ". ");
            p.wypisz();
        }
    }
}
