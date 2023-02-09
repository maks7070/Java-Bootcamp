import javax.imageio.ImageIO;
import java.util.Scanner;

public class Zad2
{
    public static void main(String[] args) {
//        String bin = Integer.toBinaryString (10);
//        System.out.println (bin);

        Scanner liczba = new Scanner (System.in);
        int dec = liczba.nextInt ();
        String bin = "";

        while(dec > 0)
        {
            bin = (dec % 2) + bin;
            dec = dec / 2;
        }
        System.out.println (bin);




    }
}
