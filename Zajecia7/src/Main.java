import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nazwa = new int[10];
        int [][] tab2d = new int[10][10];
        int value = 1;

        tab2d[1][1] = 7;

        for(int i  = 0; i < tab2d.length;i++)
        {
            for(int j  = 0; j < tab2d.length;j++)
            {
                tab2d[i][j] = value;
                value++;
            }
        }

        System.out.println (Arrays.deepToString (tab2d));

    }
}
