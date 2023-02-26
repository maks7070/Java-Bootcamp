import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTakToe
{
    /**
     * zakładamy ze 2 gracze
     * 1. Musimy miec jakas funkcje ktora nam wyrysuje te table
     * 2. Wybiernanie czy kolko czy krzyzyk
     * 3. Wbieramy ktory z graczy zaczyna gre
     * 4. Wyberanie pola
     *  4.1 sprawdzmy czy nie jest zajete
     * 5. Czy gracz nie wygrał
     * 5.1 Koniec gry, wywietlamy wiadomosc
     * 5.2 Sprawdzamy remis -
     * 5.3 gramy dalej
     *
     * 0 1 2
     * 3 4 5
     * 6 7 8
     */




    public static void displayBoard(String []tab)
    {
        System.out.println (tab[0] + "|" + tab[1] +"|" + tab[2] + "\n"
        + "-----\n" + tab[3] + "|" + tab[4] +"|" + tab[5] +"\n" + "-----\n"
        + tab[6] +"|" +tab[7] +"|" + tab[8]);
    }

    public static boolean czyPierwszy()
    {
        Random rand = new Random ();
        int liczba = rand.nextInt (2); //0 - 9
        if(liczba  == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void chooseField(String gracz, String []tab)
    {
        System.out.println ("Podaj miejsce od 0-8 gdzie wstawic znak");
        Scanner sc = new Scanner (System.in);
        int index = sc.nextInt ();

        // Spawdzenie czy dane miejsce jest puste
        if(isEmpty (tab,index))
        {
            tab[index] = gracz;
        }


    }


    public static boolean czyWygrana(String []tablica, String znak)
    {
        if(tablica[0].equals (tablica[1]) && tablica[1].equals (tablica[2]))
        {
            return true;
        }
        return true;
    }


    public static boolean isEmpty(String []tab, int index)
    {
        return tab[index].equals ("*");
    }



    public static void main(String[] args) {
        String [] tablica = new String[9];
        Arrays.fill (tablica, "*");


        // Wybor gracza
        String gracz1 = "";
        String gracz2 = "";
        System.out.println ("Gra sie zaczyna wybierz O lub X: ");
        Scanner sc = new Scanner (System.in);
        String input = sc.next ();
        if(input.equals ("X"))
        {
            gracz1 = input;
            gracz2 = "O";
        }
        else{
            gracz1 = input;
            gracz2 = "X";
        }

        String tura = "";
        if(czyPierwszy ())
        {
            tura = gracz1;
        }
        else{
            tura = gracz2;
        }





    }
}
