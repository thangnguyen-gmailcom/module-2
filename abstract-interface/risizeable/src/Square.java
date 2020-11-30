public class Square extends Rectangle {


    public Square(double side) {
        super(side,side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

//    @Override
//    public void setWidth(double width) {
//        setSide(width);
//    }
//
//    @Override
//    public void setLength(double length) {
//        setSide(length);
//    }




    @Override
    public void resize(double percent) {
        setSide(getSide() * (100 + percent) /100);
    }
}
