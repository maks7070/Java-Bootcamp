public class Z1 {
    public static void main(String[] args) {
        // Policz średnia liczb, które znajduja sie w tablicy
        int [] tab = {1,2,3,4,5,6};

        int suma = 0;
        int dlugosc = tab.length;

        for(int i = 0; i < tab.length;i++)
        {
            suma += tab[i];
        }
        System.out.println (suma/dlugosc);
    }
}
