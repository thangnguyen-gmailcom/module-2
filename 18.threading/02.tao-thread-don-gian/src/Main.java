public class Main {
    public static void main(String[] args) throws InterruptedException {
        NumberGenerator numberGenerator1 = new NumberGenerator("number 1");
        NumberGenerator numberGenerator2 = new NumberGenerator("number 2");

        Thread thread1=new Thread(numberGenerator1);
//        thread1.setPriority(Thread.MIN_PRIORITY);
        Thread thread2 = new Thread(numberGenerator2);
//        thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.start();
        thread2.join();
        thread1.start();
    }
}
