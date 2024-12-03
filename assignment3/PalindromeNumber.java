public class PalindromeNumber {

    // Public utility method
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        String numStr = Integer.toString(number);
        return isPalindromeHelper(numStr, 0, numStr.length() - 1);
    }

    // Private recursive method
    private static boolean isPalindromeHelper(String numStr, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (numStr.charAt(left) != numStr.charAt(right)) {
            return false;
        }
        return isPalindromeHelper(numStr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(-121)); // false
        System.out.println(isPalindrome(102)); // false
        System.out.println(isPalindrome(0)); // true
    }
}
