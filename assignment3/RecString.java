package a3Prob2;

public class RecString {

    public char findMinChar(String str, int index, char minChar) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string must not be null or empty.");
        }

        if (index == str.length()) {
            return minChar;
        }

        if (str.charAt(index) < minChar) {
            minChar = str.charAt(index);
        }

        return findMinChar(str, index + 1, minChar);
    }

    public static void main(String[] args) {
        RecString minChar = new RecString();
        String input = "akel";

        char result = minChar.findMinChar(input, 0, input.charAt(0));
        System.out.println("The minimum character in \"" + input + "\" is: " + result);
    }
}
