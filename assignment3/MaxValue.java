public class MaxValue {

    // Public utility method
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        return findMaxHelper(array, 0, Integer.MIN_VALUE);
    }

    // Private recursive method
    private static int findMaxHelper(int[] array, int index, int currentMax) {
        if (index == array.length) {
            return currentMax;
        }

        currentMax = Math.max(currentMax, array[index]);

        return findMaxHelper(array, index + 1, currentMax);
    }

    public static void main(String[] args) {
        int[] array = {5, -3, 6, 1, 9, 4};
        System.out.println("Max = " + findMax(array)); // Output: Max = 9
    }
}
