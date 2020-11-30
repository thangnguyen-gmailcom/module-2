public class Circle extends Shape implements Resizeable {

    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Crircle{" +
                "radius=" + radius +
                super.toString() +
                '}';
    }

    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void resize(double percent) {
        radius *= (100 + percent)/100;
    }
}
