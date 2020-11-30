public class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square("green", false, 5);
        Rectangle rectangle = new Rectangle("green",false, 5,7);
        Circle circle = new Circle("green",true,3.5);
        Shape[] shapes = new Shape[]{square, rectangle,circle};

        for (Shape shape : shapes){
            if(shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}
