public class LazyPrimeFactorization extends Thread {
    private String name;

    public LazyPrimeFactorization(String name) {
        this.name = name;
    }

    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if (checkPrime(i)) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i + " " + name);
            }
        }
    }
}
