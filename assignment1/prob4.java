package assignment1;

import java.util.Arrays;



public class prob4 {
    public static String[] removeDuplicates(String[] inputArray) {

        if (inputArray == null || inputArray.length == 0) {
            return new String[0];
        }

        String[] tempArray = new String[inputArray.length];
        int uniqueCount = 0;

        for (String currentString : inputArray) {
            // Skip null values
            if (currentString == null) {
                continue;
            }

            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (currentString.equals(tempArray[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                tempArray[uniqueCount] = currentString;
                uniqueCount++;
            }
        }

        String[] uniqueArray = new String[uniqueCount];
        System.arraycopy(tempArray, 0, uniqueArray, 0, uniqueCount);

        return uniqueArray;
    }

    public static void main(String[] args) {
        String[] input = {"horse", "dog", "cat", "horse", "dog"};

        String[] result = removeDuplicates(input);

        System.out.println(Arrays.toString(result));
    }

}
