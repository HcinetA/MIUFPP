package a3Prob1;

public class Exponential {

    public double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            throw new IllegalArgumentException("Negative exponents are not allowed. Please use natural numbers.");
        }

        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Exponential exp = new Exponential();
        double result = exp.power(2, 10);
        System.out.println("2^10 = " + result);
    }
}
