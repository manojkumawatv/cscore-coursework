package utils;

import java.util.Arrays;

public class NumberTheory {

    /**
     * Prints all prime numbers up to the specified limit n (inclusive).
     * Uses the Sieve of Eratosthenes Algo.
     *
     * @param n the upper limit (inclusive) to find primes
     */
    public boolean[] getAllPrimes(int n) { //upto n
        if (n < 2) {
            System.out.println("No primes less than 2.");
            return new boolean[1];
        }
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {  // i*i<=n : upto root of n (Optimization)
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
}
