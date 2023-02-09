public class Funkcje
{

    public static void funkcja1()
    {
        System.out.println ("Hello world");
    }

    public static void funkcja2()
    {
        funkcja1 ();
    }


    public static int funkcja3()
    {
        int liczba = 7;
        return liczba;
    }


    public static boolean funkcja4(int liczba)
    {
        if(liczba > 10)
        {
            return true;
        }
        else{
            return false;
        }
    }

    // Musicie napisac funkcje która sprawdzi czy dana liczba jest liczba parzysta


    public static boolean czyParzysta(int liczba)
    {
        if(liczba % 2 == 0)
        {
            return true;
        }
        return false;
    }



    public static boolean czyPierwsza(int liczba)
    {
        if(liczba <= 1)
        {
            return false;
        }
        for(int i  = 2; i <= Math.sqrt (liczba);i++)
        {
            if(liczba % i == 0){
                return false;
            }
        }
        return true;
    }


    //Wypisz 100 pierwszych liczb pierwszych zaczynajac od 2 - z petli



    //napisz funkcje ktora pobierze liste oraz liczbe i sprawdzi czy liczba jest w liscie

    public static boolean czyWLiscie(int [] lista, int liczba)
    {
        boolean flaga = false;

        for(int i  = 0; i < lista.length;i++)
        {
            if(lista[i] == liczba)
            {
                
                flaga = true;
            }
        }
        return flaga;

    }










    public static void main(String[] args) {
//        funkcja2 ();
//        int wartoscPozyskana = funkcja3 ();
//        System.out.println (wartoscPozyskana);
//        System.out.println (funkcja4 (11));
//
//        System.out.println (czyParzysta (9));


//        int licznik = 0;
//        int liczba = 0;
//
//
//        while(licznik <= 100)
//        {
//            if(czyPierwsza (liczba))
//            {
//                System.out.println (liczba);
//                licznik++;
//            }
//            liczba++;
//        }
        int [] lista = {1,2,43,54,6};

        System.out.println (czyWLiscie (lista,6));
    }
}
