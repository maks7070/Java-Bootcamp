public class Casting
{
    double myDouble = 10.0;

    // char -> int -> float -> double
    // double -> float -> int - > char

    public static void main(String[] args) {
        int a = 9;
        double b = a;
        System.out.println (a);
        System.out.println (b);


        // zamienic char na inta

        char c = 'A';
        int c1 = c;
        System.out.println (c1);

        double d = 9.78;
        int d1 = (int) d;
        System.out.println (d1);

        int x = 65;
        char x1 = (char) x;
        System.out.println (x1);


    }





}
