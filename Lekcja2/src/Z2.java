import java.util.Scanner;

public class Z2
{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Podaj dwie liczby do porownania");
        int liczba1 = input.nextInt ();
        int liczba2 = input.nextInt ();


        if(liczba1 > liczba2)
        {
            System.out.println ("Liczba 1 jest wieksza od liczby2");
        }
        else if(liczba1 < liczba2)
        {
            System.out.println ("Liczba 2 jest wieksza od liczby 1");
        }
        else{
            System.out.println ("Liczby sa takie same");
        }
    }
}
