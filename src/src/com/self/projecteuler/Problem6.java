package src.com.self.projecteuler;

import java.util.stream.IntStream;

public class Problem6 {

    public Integer sumOfSquares(Integer maxNumber) {
        return IntStream.rangeClosed(1, maxNumber).map(i -> i * i).sum();
    }

    public Integer squareOfSum(Integer maxNumber) {
        Integer sum = IntStream.rangeClosed(1, maxNumber).sum();
        return sum * sum;
    }

    public Integer difference(Integer maxNumber) {
        return squareOfSum(maxNumber) - sumOfSquares(maxNumber);
    }

}
