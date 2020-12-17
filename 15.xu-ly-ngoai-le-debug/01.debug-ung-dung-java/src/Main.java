import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a : ");
        int a = sc.nextInt();
        System.out.println("b : ");
        int b = sc.nextInt();

        if(a != 0) {
            double solution = -b/a;
            System.out.println("phuong trinh co nghiem :" + solution);
        }else if(b == 0){
            System.out.println("phuong trin co vo so nghiem");
        }else {
            System.out.println("phuong trình vo nghiem");
        }
    }
}
