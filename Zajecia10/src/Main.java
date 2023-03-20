import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    //OOP- object oriented programming

    static ArrayList<Owoc> owoce = new ArrayList<>();

    public static Owoc stworzOwoc()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwe");
        String nazwa = sc.next();
        System.out.println("Podaj kolor");
        String kolor = sc.next();
        System.out.println("Podaj rozmiar");
        String rozmiar = sc.next();

        return new Owoc(nazwa,kolor,rozmiar);
    }


    public static void pokazListe()
    {
        for(Owoc o: owoce){
            System.out.println(o);
        }
    }





    public static void main(String[] args) {
        for(int i  = 0; i < 5;i++)
        {
            owoce.add(stworzOwoc());
            pokazListe();

        }

    }
}
