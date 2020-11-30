public class ShapeTest {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        System.out.println("before :");
        shapes[0] = new Circle(3.5);
        shapes[1] = new Square(4);
        shapes[2] = new Circle(5);
        for (Resizeable shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("After :");
        for (Resizeable shape : shapes) {
           shape.resize(Math.random()*100);
        }

        for (Resizeable shape : shapes) {
            System.out.println(shape);
        }


    }
}
