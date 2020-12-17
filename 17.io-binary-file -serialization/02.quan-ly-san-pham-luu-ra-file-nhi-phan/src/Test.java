import java.util.Arrays;

public class Test {

    public static int pivot(int[] arr ,int left, int right){
        int  pi = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++){
            if(arr[j] < pi){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;

        return i+1;
    }

    public static void quickSort(int arr[], int left, int right){
        if(left<right){
            int pivot = pivot(arr, left, right);

            quickSort(arr,left, pivot-1);
            quickSort(arr,pivot+1, right);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,8,4,5,9,7};

        System.out.println(Arrays.toString(arr));

        quickSort(arr,0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
