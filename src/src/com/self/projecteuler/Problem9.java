package src.com.self.projecteuler;

public class Problem9 {

    public Integer pythagoreanTriplet(int sum) {
        int startValue = sum/2;
        for (int i = startValue; i > 0; i--) {
            for (int j = startValue; j > 0; j--) {
                int sqrt = (int) Math.sqrt((i * i) + (j * j));
                if (sqrt * sqrt == ((i * i) + (j * j)) && i + j + sqrt == sum) {
                    System.out.println("a: " + i + "\nb: " + j + "\nc: " + sqrt);
                    return i * j * sqrt;
                }
            }
        }
        return -1;
    }
}
