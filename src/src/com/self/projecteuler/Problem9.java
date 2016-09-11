package src.com.self.projecteuler;

public class Problem9 {

    public Integer pythagoreanTriplet() {
        for (int i = 500; i > 0; i--) {
            for (int j = 500; j > 0; j--) {
                int sqrt = (int) Math.sqrt((i * i) + (j * j));
                if (sqrt * sqrt == ((i * i) + (j * j)) && i + j + sqrt == 1000) {
                    System.out.println("a: " + i + "\nb: " + j + "\nc: " + sqrt);
                    return i * j * sqrt;
                }
            }
        }
        return -1;
    }
}
