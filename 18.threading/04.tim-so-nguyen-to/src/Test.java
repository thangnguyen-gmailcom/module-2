public class Test {

    public static void main(String[] args) {
        LazyPrimeFactorization lpf = new LazyPrimeFactorization("LazyPrimeFactorization");
        OptimizedPrimeFactorization opf = new OptimizedPrimeFactorization("OptimizedPrimeFactorization");
        lpf.start();
        opf.start();
    }
}
