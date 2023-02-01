import java.util.Scanner;

public class Zadanie1
{
    public static void main(String[] args) {
        // Zadanie:
        // Dostajemy liczbe i musimy sprawdzic czy dana liczba jest palindromem
        // 101 kajak
        Scanner input = new Scanner (System.in);
        int liczba = input.nextInt ();
        String koniec = "";
        String test = String.valueOf (liczba);
        // liczba = 15, test = "15"

        while(liczba != 0)
        {
            int reszta = liczba % 10;
            koniec = koniec + String.valueOf (reszta);
            liczba = liczba / 10;
        }

        System.out.println (koniec);
        System.out.println (test);


        //157 / 10 = 15 15.7
    }
}
