import java.util.Arrays;

public class Tablice
{
    public static void main(String[] args) {
//        int []nazwaTab = {1,2,3,4,5,6};
//        System.out.println (Arrays.toString (nazwaTab));
//        nazwaTab = new int[7];
//        System.out.println (Arrays.toString (nazwaTab));
//        nazwaTab[nazwaTab.length-1] = 6;
//        int [] tab2 = new int[10];
//        System.out.println (Arrays.toString (tab2));

        // [1,2,3,4]
        // [0,0,0,0,0]
        // [1,2,3,4,liczbaDoDodania]

        int [] tab = {1,2,3,4};
        int liczbaDoDodania = 5;
        int []tabPom = new int[tab.length + 1];
        System.out.println (Arrays.toString (tabPom));

        for(int i = 0; i < tab.length;i++)
        {
            tabPom[i] = tab[i];
        }
        System.out.println (Arrays.toString (tabPom));

        tabPom[tabPom.length - 1] = liczbaDoDodania;
        System.out.println (Arrays.toString (tabPom));

        tab = tabPom;
        System.out.println (Arrays.toString (tab));

        // Odejmowanie jednego elementu


        int []tmp = new int[tab.length - 1];


        for(int i = 0; i < tmp.length;i++)
        {
            tmp[i] = tab[i];
        }

        System.out.println (Arrays.toString (tmp));
        tab = tmp;
        System.out.println (Arrays.toString (tab));
        System.out.println (tab);

        // Polaczyc ze soba 2 tablice
        //{1,2,3}, {4,5,6}
        //{1,2,3,4,5,6}

        int []tab1 = {1,2,3};
        int []tab2 = {4,5,6};
        int []tabKon = new int[tab1.length + tab2.length];


        for(int i  = 0; i < tab1.length;i++)
        {
            tabKon[i] = tab1[i];
        }

        System.out.println (Arrays.toString (tabKon));

        int indexStart = tab1.length;
        for(int i = indexStart;i < tabKon.length;i++)
        {
            tabKon[i] = tab2[i-tab1.length];
        }
        System.out.println (Arrays.toString (tabKon));


    }
}
