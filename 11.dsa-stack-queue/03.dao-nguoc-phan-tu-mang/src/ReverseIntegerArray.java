import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i ++) {
            array[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        for(int num : array) {
            stack.push(num);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        System.out.println(Arrays.toString(array));
    }
}
