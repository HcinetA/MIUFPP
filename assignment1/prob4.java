package assignment1;

import java.util.Arrays;



public class prob4 {
    public static void main(String[] args) {
        String[] inputArray = {"horse", "dog", "cat", "horse", "dog"};

        String[] uniqueArray = removeDuplicates(inputArray);
        System.out.println(Arrays.toString(uniqueArray));
    }

    public static String[] removeDuplicates(String[] array) {
        Arrays.sort(array);

        String[] tempArray = new String[array.length];
        int uniqueIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || !array[i].equals(array[i - 1])) {
                tempArray[uniqueIndex++] = array[i];
            }
        }

        String[] resultArray = new String[uniqueIndex];
        System.arraycopy(tempArray, 0, resultArray, 0, uniqueIndex);

        return resultArray;
    }
}
