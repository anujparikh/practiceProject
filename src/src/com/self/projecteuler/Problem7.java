package src.com.self.projecteuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem7 {
    public Integer findNthPrimeNumber(Integer nthNumber) {
        List<Integer> primeList = new ArrayList<>();
        primeList.addAll(Arrays.asList(2, 3));
        Integer initializer = 4;
        while (primeList.size() < nthNumber) {
            if (isPrime(initializer, primeList)) {
                primeList.add(initializer);
            }
            initializer++;
        }
        return primeList.get(primeList.size() - 1);
    }

    public Boolean isPrime(Integer input, List<Integer> primeList) {
        return !(primeList.parallelStream().anyMatch(i -> input % i == 0));
    }
}
