import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        System.out.println(checkPal(str));
    }

    public static boolean checkPal(String str) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        String formatStr = str.toUpperCase();
        for (int i = 0; i <str.length() ; i++) {
            stack.push(formatStr.charAt(i));
            queue.offer(formatStr.charAt(i));
        }
        while (!stack.isEmpty()){
            if(stack.pop() != queue.poll()) return false ;
        }
        return true;
    }
}
