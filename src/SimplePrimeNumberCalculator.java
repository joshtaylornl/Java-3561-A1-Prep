import java.util.LinkedList;
import java.util.List;

/**
 * A simple (non optimized) prime number calculator
 */
public class SimplePrimeNumberCalculator extends PrimeNumberCalculator {

    @Override
    public boolean isPrime(int n) {
        return getLowestDivisor(n) == n;
    }

    @Override
    public List<Integer> getUniquePrimeFactorization(int n) {
        List<Integer> primeList = new LinkedList<>();
        primeList.add(n);

        return primeList;
    }

    /**
     * Returns the lowest integer divisor (>=2) of n. If n is prime it will
     * return n
     * @param n
     * @return
     */
    private int getLowestDivisor(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                return i;
            }
        }
        return n;
    }

}
