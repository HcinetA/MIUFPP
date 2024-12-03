public class Exponential {

    public double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        else if (n==1){
            return x;
        }

        else if (n < 0 ) {
            throw new IllegalArgumentException("n can't be negative only use naturel numbers is undefined");

        }

        return x * power(x, n - 1);


    }

    public static void main(String[] args) {
        Exponential exp = new Exponential();
        double result = exp.power(2, 10);
        System.out.println("2^10 = " + result);
    }
}