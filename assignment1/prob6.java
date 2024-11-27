package assignment1;

public class prob6 {
    public static void main(String[] args) {
        int[] a = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};

        secondMin(a);
    }

    public static void secondMin(int[] a) {
        if (a.length < 2) {
            System.out.println("we need at least two distinct elements.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > min && a[i] < secondMin) {
                secondMin = a[i];
            }
        }


            System.out.println("Second Minimum: " + secondMin);

    }
}
