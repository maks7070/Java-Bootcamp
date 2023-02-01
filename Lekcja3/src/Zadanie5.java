import java.util.Scanner;

public class Zadanie5
{
    public static void main(String[] args) {
        System.out.print ("Input number of rows: ");
        Scanner in = new Scanner (System.in);
        int n =in.nextInt ();

        for(int i = 1; i <= n;i++)
        {

            for(int j = 1; j <= i;j++)
            {
                System.out.print (j);
            }
            System.out.println ("");

        }
    }
}
