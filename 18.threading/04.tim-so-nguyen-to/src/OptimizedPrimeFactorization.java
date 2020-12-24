public class OptimizedPrimeFactorization extends Thread {
    private String name;

    public OptimizedPrimeFactorization(String name) {
        this.name = name;
    }

    public boolean checkPrime(int number){
        if(number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number) ; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public void run (){

        for (int i = 0; i < 100 ; i++) {
            if(checkPrime(i)){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i + " " + name);
            }
        }
    }
}
