package watch;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        int[] arr = new int[100000];
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        stopwatch.start();
        selectionSort(arr);
        stopwatch.stop();
        System.out.println(stopwatch.getElapsedTime());


    }

    public static void selectionSort(int[] arr) {
        int indexMin, i, j;

        for (i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            // kiem tra phan tu hien tai có phai la nho nhat khong
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            //
            if (indexMin != i) {
                // trao doi cac so
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
