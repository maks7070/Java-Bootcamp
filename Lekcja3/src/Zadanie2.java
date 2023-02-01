import java.util.Scanner;

public class Zadanie2
{
    /**
     * ZADANIE 2 (Liczby doskonałe)
     * Opracuj aplikację w języku Java analizującą liczby podawane przez użytkownika i określającą czy podana liczba
     * jest liczbą doskonałą.
     * Liczba doskonała to liczba naturalna równa sumie swoich podzielników właściwych (np. 6 = 1 + 2 + 3 lub 28 =
     * 1 + 2 + 4 + 7 + 14);
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int liczba = scanner.nextInt ();

        int suma = 0;
        for (int i = 1; i < liczba ; i++) {
            // liczba = 5
            // i = 1
            // i =2
            // i = 3
            // i = 4

            if(liczba % i == 0)
            {
                suma = suma + i;
            }



        }

        if(suma == liczba)
        {
            System.out.println ("liczba jest doskonala ");
        }





    }
}
