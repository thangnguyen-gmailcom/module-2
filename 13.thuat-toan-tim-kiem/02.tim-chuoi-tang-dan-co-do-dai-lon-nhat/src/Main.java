import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();  // O(1)

        LinkedList<Character> list = new LinkedList<>(); // O(1)
        for (int i = 0; i < str.length(); i++){          // O(n)
            list.add(str.charAt(i));                     // O(1)
            for (int j = i + 1; j < str.length(); j++) { // O(n)
                if(str.charAt(j) > list.getLast()){      // O(1)
                    list.add(str.charAt(j));
                }
            }
            if(list.size() > max.size()){                // O(1)
                max.clear();
                max.addAll(list);
            }

            list.clear();
        }

        for (Character ch : max) {                     // O(n)
            System.out.print(ch);
        }

        // do phuc tap cua thuat toan : O(n) * O(n) + O(n) = O(n^2)
    }
}
