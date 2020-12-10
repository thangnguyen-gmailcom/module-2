import java.util.Stack;

public class CheckBrackets {
    public static final char BRACKETLEFT = '(';
    public static final char BRACKETRIGHT = ')';

    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b) * (s – c)";
        String str1 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String str2 = "s * (s – a) * (s – b * (s – c)";
        String str3 = "s * (s – a) * s – b) * (s – c)";
        String str4 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        System.out.println(checkBr(str));
        System.out.println(checkBr(str1));
        System.out.println(checkBr(str2));
        System.out.println(checkBr(str3));
        System.out.println(checkBr(str4));
    }

    public static boolean checkBr(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case BRACKETLEFT:
                    stack.push(str.charAt(i));
                    break;
                case BRACKETRIGHT:
                    if (stack.isEmpty()) {
                        return false;
                    }
                    stack.pop();
                    break;
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
