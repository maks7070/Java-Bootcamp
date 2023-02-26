public class PD4
{
    public static boolean hasDiv(int liczba){
        int counter = 0;

        for(int i  = 1; i <= liczba;i++)
        {
            if(liczba % i == 0)
            {
                counter++;
            }
        }
        return counter > 4;

    }
}
