import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        double[] arr = {1, 9, 4.5, 6.6, 5.7, -4.5};

        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
    }

    public static void selectionSort(double[] arr){
        for (int i = 0; i < arr.length ; i++) {
            double minValue = arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(minValue > arr[j]){
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = minValue;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
