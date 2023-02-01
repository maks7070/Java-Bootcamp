import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int liczba = input.nextInt ();
        String test = String.valueOf (liczba);
        String kon = "";

        while(liczba != 0)
        {
            int reszta = liczba % 10;
            kon += String.valueOf (reszta);
            liczba /= 10;
        }
        System.out.println (kon);
        System.out.println (test);

        if(kon.equals (test))
        {
            System.out.println ("Liczba jest palindromem");
        }
        else{
            System.out.println ("Liczba nie jest palindromem");
        }
    }
}
