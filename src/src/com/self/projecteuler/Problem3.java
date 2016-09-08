package src.com.self.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {

    public static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    public static List<Long> primeFactors(Long number) {
        Long n = number;
        List<Long> factors = new ArrayList<>();
        for (Long i = 2L; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    public static void main(String[] args) {
        System.out.println("Primefactors of Long 600851475143L");
        for (Long integer : primeFactors(600851475143L)) {
            System.out.println(integer);
        }

        System.out.println("Primefactors of 32");
        for (Integer integer : primeFactors(32)) {
            System.out.println(integer);
        }

        System.out.println("Primefactors of 7");
        for (Integer integer : primeFactors(21)) {
            System.out.println(integer);
        }
    }
}
