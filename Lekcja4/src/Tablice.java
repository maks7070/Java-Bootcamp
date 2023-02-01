public class Tablice
{
    // typ[] nazwa_tablicy = {"elementylisty","elementylisty"}

    public static void main(String[] args) {
        int []listaLiczb = {324,324,65764,123,54563};
        //System.out.println (listaLiczb[4]);
        for (int i = 0; i < listaLiczb.length; i++) {
            System.out.println (listaLiczb[i]);
        }

        // Napisz program, który policzy sume liczb w liscie

        int a = 0;
        for(int j = 0; j < listaLiczb.length;j++)
        {
            a = a + listaLiczb[j];
        }
        System.out.println (a);
    }
}
