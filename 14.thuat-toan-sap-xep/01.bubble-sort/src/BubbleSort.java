import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        double[] array = {1, 9, 4.5, 6.6, 5.7, -4.5};

        System.out.println(Arrays.toString(array));

        bubbleSort(array);
    }

    public static void bubbleSort(double[] array){
        double temp = 0;
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = 0; j < array.length-1-i ; j++) {
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
