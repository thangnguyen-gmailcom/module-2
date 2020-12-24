import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("a : ");
            double a = sc.nextDouble();

            System.out.println("b : ");
            double b = sc.nextDouble();

            System.out.println("c : ");
            double c = sc.nextDouble();

            if(a <= 0 || b <= 0 || c <=0){
                throw new IllegalTriangleException("lỗi ! cạnh không thể là số âm");
            }

            if(a+ b < c || b +c < a || a +c < b){
                throw new IllegalTriangleException(" lỗi ! không phải ba canh của tam giác");
            }
            System.out.println("ba cạnh của tam giác là :" + a + " " + b + " " + c + " ");
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
        System.err.println("hello loi");
    }
}
