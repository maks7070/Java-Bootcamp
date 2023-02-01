import java.util.Scanner;

public class Z1
{
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println ("Podaj liczbe z klawiatury");
        int liczba = input.nextInt ();


        if(liczba > 18)
        {
            System.out.println ("Pobrana liczba jest wieksza niz 18");
        }



    }
}
