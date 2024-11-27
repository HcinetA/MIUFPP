package assignment1;

import java.util.Random;

public class prob1 {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(1,9);
        int y = random.nextInt(3,14) ;

        double result1 = Math.pow(Math.PI, x);

        double result2 = Math.pow(y, Math.PI);

        System.out.printf("π^%d = %.2f%n", x, result1);
        System.out.printf("%d^π = %.2f%n", y, result2);
    }
}



