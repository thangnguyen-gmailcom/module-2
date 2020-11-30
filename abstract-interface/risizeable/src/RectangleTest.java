public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,8);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        rectangle.resize(10);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
