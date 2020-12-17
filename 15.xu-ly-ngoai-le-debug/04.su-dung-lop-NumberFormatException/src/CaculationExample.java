import java.util.Scanner;

public class CaculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập x : ");
        int x = sc.nextInt();
        System.out.println("Hãy nhập y : ");
        int y = sc.nextInt();
        CaculationExample caculationExample = new CaculationExample();
        caculationExample.caculate(x,y);
    }

    public void caculate(int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        }catch (Exception e){
            System.err.println("xảy ra ngoại lệ : " + e.getMessage());
        }
    }
}
