import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {


        System.out.println ("Pobierz liczbe z klawiatury:");
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt ();
        //int liczba2 = input.nextInt ();
        System.out.println ("Pobrana liczba: " + liczba);
        //System.out.println ("Pobrana liczba: " + liczba2);

        if(liczba > 10)
        {
            System.out.println ("Liczba jest wieksza od 10");
        }
        else if(liczba < 10)
        {
            System.out.println ("Liczba jest mniejsza od 10");
        }else{
            System.out.println ("Liczba jest rowna 10");
        }


        // Wprowadz liczbe z klawiatury oraz sprawdz czy dana liczba jest wieksza niz 18


        // Wprowadz dwie liczby z klawiatury i porownaj je

        if(liczba % 2 == 0)
        {
            System.out.println ("liczba jest podzielna przez 2");
        }


        //Pobierz liczbe z klawiatury jezeli ta liczba jest podzielna przez 3 to napisz ze jest podzielna.
        // Jezeli liczba jest podzialna przez 2 to napisz ze jest podzielna.

        // Sprawdz czy liczba jest podzialna przez 2 i 3 w tym samym momencie i wypisz odpowiedna wiadomosc ale nie zadana inna wiadomosc..



        double pierwiastek = Math.sqrt (liczba);
        System.out.println (pierwiastek);










    }
}
