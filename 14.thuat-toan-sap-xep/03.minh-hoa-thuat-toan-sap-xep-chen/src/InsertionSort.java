import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        double[] arr =  {1, 9, 4.5, 6.6, 5.7, -4.5};

        System.out.println(Arrays.toString(arr));

        insertionSort(arr);
    }

    public static void insertionSort(double[] arr){
        int j;
        double value;
        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
            j = i-1;
            while (j>=0 && arr[j] > value){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = value;
        }

        System.out.println(Arrays.toString(arr));
    }
}
