import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :"); // welcome
        String str = sc.nextLine();

       int[] frequentChar = new int[255];

        for (int i = 0; i < str.length(); i++){              // O(n)
            frequentChar[str.charAt(i)] += 1;               // O(1)
        }

        int max = 0;                                       // O(1)
        char character = (char) 255;                       // O(1)
        for (int i = 0; i <frequentChar.length ; i++) {    // O(n)
            if(frequentChar[i] > max){                     // O(1)
                max = frequentChar[i];                     // O(1)
                character = (char) i;                      // O(1)
            }
        }
        System.out.println(character);
    }

    // do phuc tap cua thuat toan T(n) = O(n) + O(n) = O(n)
}
