import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public double getDiscriminant() {
        double delta = Math.pow(b,2) - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/ (2*a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/ (2*a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = scanner.nextDouble();
        System.out.print("Enter b : ");
        double b = scanner.nextDouble();
        System.out.print("Enter c : ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
       double delta = quadraticEquation.getDiscriminant();
        if(delta < 0) {
            System.out.println("The equation has no roots");
        }else if(delta == 0) {
            System.out.println("the one root is :" +  quadraticEquation.getRoot1());
        }else {
            System.out.println("the first root : " +  quadraticEquation.getRoot1());
            System.out.println("the second root : " + quadraticEquation.getRoot2());
        }
    }
}
