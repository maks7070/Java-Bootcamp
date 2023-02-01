import java.util.Scanner;

public class Zadanie2
{
    // Macie podana liste z liczbami - pobieracie jedna liczbe z klawiatury i musicie sprawdzic czy ta liczba jest w tej liscie

    //Input {4,7,3,2} liczba = 2  ->>>>> jest w liscie

    public static void main(String[] args) {
        int []listaLiczb = {324,324,65764,123,54563};
        Scanner input = new Scanner (System.in);
        int liczba = input.nextInt ();
        boolean flag = false;
        for(int i  = 0; i < listaLiczb.length;i++)
        {
            //System.out.println (listaLiczb[i]);
            if(listaLiczb[i] == liczba)
            {
                //System.out.println ("Liczba jest w liscie");
                flag = true;
            }
        }
        if(flag == true)
        {
            System.out.println ("Liczba jest w liscie");
        }
    }
}
