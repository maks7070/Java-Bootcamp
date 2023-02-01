import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {


        //Sprawdz czy podana liczba jest licza armstronga
        // Liczba armstronga to taka liczba ze
        //153 = 1^3 + 5^3 + 3^3

        Scanner input = new Scanner (System.in);
        int liczba = input.nextInt ();
        int orginal = liczba;


        int suma = 0;
        while(liczba != 0)
        {
            int reszta = liczba % 10;
            suma = suma + reszta * reszta * reszta;
            liczba = liczba / 10;
        }

        if(orginal == suma)
        {
            System.out.println ("Jest liczba armstronga");
        }



    }
}
