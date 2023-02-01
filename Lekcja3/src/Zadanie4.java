import java.util.Scanner;

public class Zadanie4
{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int liczba = input.nextInt ();
        if(liczba <= 1)
        {
            liczba = input.nextInt ();
        }


        boolean flaga = true;
        for(int i = 2; i < liczba;i++ )
        {
            if(liczba % i == 0)
            {
                flaga = false;
            }
        }

        if(flaga == true)
        {
            System.out.println ("Podana liczba jest pierwsza");
        }else{
            System.out.println ("Podana liczba jest zlozona");
        }



    }
}
