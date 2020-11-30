public class Square extends Rectangle implements Colorable {

    public Square(String color, boolean filled, double size) {
        super(color,filled,size,size);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        setWidth(size);
        setLength(size);
    }

    public double getArea() {
        return  Math.pow(getSize(),2);
    }

    public void howToColor() {
        System.out.println(" Color all four sides");
    }
}
