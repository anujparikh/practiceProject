package src.com.self.projecteuler;

public class Problem5 {

    private static long lcm(long a, long b) {
        long lcm,hcf = 0;
        long i=1;
        long ger=a>b?a:b;
        while(i<ger)
        {
            if((a%i==0) && (b%i==0))
                hcf=i;
            i++;
        }
        lcm=(a*b)/hcf;
        return lcm;
    }

    public static void main(String[] args) {
        long first = 1;
        long second = 2;
        for (int i = 3; i < 21; i++) {
            first = lcm(first, second);
            second = i;
        }
        System.out.println("Result: " + first);
    }
}
