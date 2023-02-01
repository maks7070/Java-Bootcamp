public class Zadanie4
{
    public static void main(String[] args) {
        int []listaLiczb = {324,324,65764,123,54563};

        double suma = 0;

        for(int i = 0; i < listaLiczb.length;i++)
        {
            suma = suma + listaLiczb[i];

        }
        System.out.println ("Suma: " + suma);
        System.out.println ("Srednia: " + suma/listaLiczb.length);

        // 2.99
    }
}
