import java.util.Scanner;

public class Z1
{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int bin = input.nextInt ();
        int dec = 0;
        int n = 0;


        while(true)
        {
            if(bin == 0)
            {
                break;
            }
            else{
                int tmp = bin % 10;
                dec += tmp*Math.pow (2,n);
                bin = bin/10;
                n++;
            }




        }
        System.out.println (dec);
    }
}
