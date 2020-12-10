import java.util.Scanner;
import java.util.Stack;

public class ConvertNumber {
    //1001
    public static final char[] DIGITS = {'0','1', '2', '3', '4', '5', '6', '7', '8','9','A','B','C','D', 'E','F'};
    public static int fromBinaryToDecimal(int num) {
        Stack<Integer> stack = new Stack<Integer>();
        String str = Integer.toString(num);
        for (int i = 0; i <str.length() ; i++) {
            stack.push(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        int Decimal = 0;
        int size = stack.size();

        for (int i = 0; i < size; i++) {
            Decimal += stack.pop() * Math.pow(2,i);
        }
        return Decimal;
    }

    public static int fromDecimalToBinary(int number) {
        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            stack.push(number%2);
            number/=2;
        }
        String result = "";
        while (!stack.isEmpty()){
            result +=(Integer.toString(stack.pop()));
        }
        return Integer.parseInt(result);
    }

    public static String fromDecimalToHexadecimal(int number) {
        Stack<Character> stack = new Stack<>();
        while (number>0) {
            stack.push(DIGITS[number%16]);
            number /= 16;
        }
        String result = "";
        int size = stack.size();
        for (int i = 0; i <size ; i++) {
            result += stack.pop();
        }
        return result;
    }

    public static int fromHexadecimalToDecimal(String str) {
        Stack<Integer> stack = new Stack<>();
        String digit = String.valueOf(DIGITS);
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            stack.push(digit.indexOf(ch));
        }
        int result = 0;
        int i = 0;
        while (!stack.isEmpty()){
            result += stack.pop() * Math.pow(16,i);
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(fromDecimalToBinary(number));
        int number1 = sc.nextInt();
        System.out.println(ConvertNumber.fromBinaryToDecimal(number1));
        int number2 = sc.nextInt();
        sc.nextLine();
        System.out.println(fromDecimalToHexadecimal(number2));
        String number3 = sc.nextLine();
        System.out.println(fromHexadecimalToDecimal(number3));
    }
}