package assignment1;

import java.util.Arrays;

public class prob5 {
    public static void main(String[] args) {
        int[] arrayA = {5, 6, -4, 3, 1};
        int[] arrayB = {3, 8, 9, 11};

        int[] combinedArray = combine(arrayA, arrayB);

        System.out.println(Arrays.toString(combinedArray));
    }

    public static int[] combine(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }
}
