package src.com.self.projecteuler;

import java.util.stream.IntStream;

public class Problem1 {
    public static void main(String[] args) {
        Integer sum = IntStream.range(1, 1000)
                                .filter(i -> (i % 3 == 0) || (i % 5 == 0))
                                .sum();

        System.out.println("Sum: " + sum);
    }
}
