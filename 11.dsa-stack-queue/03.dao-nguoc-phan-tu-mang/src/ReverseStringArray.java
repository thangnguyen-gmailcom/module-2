import java.util.Arrays;
import java.util.Stack;

public class ReverseStringArray {
    public static void main(String[] args) {
        String str = "thang xuan duy nguyen";
        String[] strings = str.split(" ");
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < strings.length; i++) {
            stack.push(strings[i]);
        }

        for (int i = 0; i < strings.length ; i++) {
            strings[i] = stack.pop();
        }
        
        for (int i = 0; i < strings.length ; i++) {
        System.out.print(strings[i] + " ");
        }
    }
}
