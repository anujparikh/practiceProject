package src.com.self.projecteuler;

public class Problem2 {

    private static Integer first = 0;
    private static Integer second = 1;

    private static void fibonacciFunction() {
        if (first + second < 4000000) {
            Integer sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
            fibonacciFunction();
        }
    }

    public static void main(String[] args) {
        System.out.print("0 1 ");
        fibonacciFunction();
    }
}
