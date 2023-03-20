public class Produkt
{
    private String nazwa;
    private int cena;
    private String kategoria;


    public Produkt(String nazwa, int cena, String kategoria)
    {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
    }


    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }


    public String getNazwa() {
        return nazwa;
    }

    public String getKategoria() {
        return kategoria;
    }


    public void wypisz()
    {
        System.out.println("Produkt: " + nazwa + ", cena: " + cena + " , kategoria: " + kategoria);

    }



    public void obnizCene(int procentObnizki)
    {
        int procentCeny = 100 - procentObnizki;
        double procent = procentCeny/100;
        int cenaKoncowa = (int) (procent * cena);
        setCena(cenaKoncowa);
    }
}
