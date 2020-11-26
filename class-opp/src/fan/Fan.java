package fan;

public class Fan {
     final int SLOW = 1;
     final int MEDIUM = 2;
     final int FAST = 3;
     private int speed = SLOW;
     private boolean on = false;
     private double radius = 5;
     private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
        return( on ?"speed : " + speed + " color : " + color + " radius :" + radius + " fan is on":"color : " + color + "radius :" + radius + "fan is off");
    }
}
