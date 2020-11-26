public class Clock {
    String name;
    String color;
    double price;
    Clock(String name, String color, double price ){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   public void getDateTime() {
       System.out.println(java.time.LocalDateTime.now());
   }

    public static void main(String[] args) {
        Clock clock = new Clock("Đồng hồ cơ", "white",200000);
        clock.getDateTime();

    }
}
