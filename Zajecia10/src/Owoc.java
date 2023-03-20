public class Owoc
{
    public  String nazwa;
    private String kolor;
    private String rozmiar;

    public Owoc(String nazwa, String kolor, String rozmiar)
    {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.rozmiar = rozmiar;
    }


    @Override
    public String toString() {
        return "Owoc{" +
                "nazwa='" + nazwa + '\'' +
                ", kolor='" + kolor + '\'' +
                ", rozmiar='" + rozmiar + '\'' +
                '}';
    }
}
