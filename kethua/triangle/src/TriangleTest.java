public class TriangleTest {

    public static void main(String[] args) {
        Triangle triangle = new Triangle("green", 3,4,5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        triangle.setSide1(20);
        triangle.setSide2(30);
        triangle.setSide3(40);
        System.out.println(triangle);
        System.out.println(triangle.getArea());
    }
}
