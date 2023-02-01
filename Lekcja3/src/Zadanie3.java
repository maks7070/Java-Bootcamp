import java.util.Scanner;

public class Zadanie3
{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int liczba = input.nextInt ();

        for(int i = 1; i < liczba + 1;i++)
        {
            if(liczba % i == 0){
                System.out.println (i);
            }
        }
    }
}
