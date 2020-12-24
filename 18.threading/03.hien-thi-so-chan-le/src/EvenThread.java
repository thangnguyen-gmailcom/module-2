public class EvenThread extends Thread {

    public void run(){
        for (int i = 1; i <= 10 ; i++) {
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
