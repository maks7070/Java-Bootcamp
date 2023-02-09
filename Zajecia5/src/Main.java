import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        //Scanner input = new Scanner (System.in);
//        String liczba = input.next();
//        int dec = Integer.parseInt (liczba,2);
//        System.out.println (dec);
        //int bin = input.nextInt ();
        int []listaBin = {1,0,1,0};
        int suma = 0;
        for(int i = listaBin.length - 1; i >= 0;i--)
        {
            if(listaBin[i] == 1)
            {
                //.out.println (i);
                //System.out.println (suma);
                suma = (int) (suma + Math.pow (2,listaBin.length-1-i));
            }

        }
        System.out.println (suma);


    }
}
