public class Main {


    public static final int DISTANCE = 100 ;

    public static void main(String[] args) {
    Car lamborghini = new Car("lamborghini");
    Car bm = new Car("bm");
    Car ronroy = new Car("ronroy");

    Thread thread1 = new Thread(lamborghini);
    Thread thread2 = new Thread(bm);
    Thread thread3 = new Thread(ronroy);

    thread1.start();
    thread2.start();
    thread3.start();
    }
}
