public class FunWithPrimes {

    public static void main(String[] args) {
        System.out.println("Fun With Primes!");

        int n = 4;
        PrimeNumberCalculator pc = new SimplePrimeNumberCalculator();

        System.out.printf("%d ; Prime? %b ", n, pc.isPrime(n));



    }

}
