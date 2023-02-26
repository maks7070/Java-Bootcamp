public class PD1 {

    public static boolean isArmstrong(int liczba)
    {
        int suma = 0;
        String tmp = String.valueOf (liczba);


        //153
        for(char c : tmp.toCharArray ())
        {
            int l = Character.getNumericValue (c);
            suma += l * l * l;
        }
        //System.out.println (suma);
        return suma == liczba;
    }


    public static void main(String[] args) {
        int liczba = 0;
        for(int i  = 0; i <= 1000;i++)
        {
            if(isArmstrong (i))
            {
                System.out.println (i);
            }
        }
    }
}
