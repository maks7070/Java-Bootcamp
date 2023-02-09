public class Z2
{
    public static void main(String[] args) {
        int []lista = {1,2,3,4,5,6,7,2,4,6,7,-1};

        int max = lista[0];

        for(int i = 0; i < lista.length;i++)
        {
            if(lista[i] < max)
            {
                max = lista[i];
                System.out.println ("Max sie zmienia: " + max);
            }
        }
        System.out.println ("Maksimum: " + max);


    }
}
