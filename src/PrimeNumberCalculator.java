import java.util.List;

public abstract class PrimeNumberCalculator {

    /**
     * Determines if n is prime
     * @param n integer (>1)
     * @return true of prime, false otherwise
     */
    public abstract boolean isPrime(int n);

    /**
     * Get the unique prime factorization of n. If n is prime the list is just itself.
     * Every number can be represented as a unique product of primes.
     * @param n integer (>1)
     * @return list of prime factors
     */
    public abstract List<Integer> getUniquePrimeFactorization(int n);

}
