import java.util.Arrays;
import java.util.List;

public class PD2 {


    public static int[] addElement(int []arr, int element){
        int [] newArr = new int[arr.length + 1];
        for(int i = 0; i < arr.length;i++)
        {
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = element;
        return newArr;
    }



    public static void main(String[] args) {
        int []arr = new int[0];

        for(int i  = 0; i <= 10;i++){
            arr = addElement (arr,i);

        }
        System.out.println (Arrays.toString (arr));
    }
}
