import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeNumberTest {

    @Test
    public void testPositivePalindromeNumbers() {
        // Test various positive palindrome numbers
        assertTrue("121 should be a palindrome", PalindromeNumber.isPalindrome(121));
        assertTrue("11 should be a palindrome", PalindromeNumber.isPalindrome(11));
        assertTrue("0 should be a palindrome", PalindromeNumber.isPalindrome(0));
        assertTrue("5 should be a palindrome", PalindromeNumber.isPalindrome(5));
        assertTrue("12321 should be a palindrome", PalindromeNumber.isPalindrome(12321));
    }

    @Test
    public void testNonPalindromeNumbers() {
        // Test various non-palindrome numbers
        assertFalse("102 should not be a palindrome", PalindromeNumber.isPalindrome(102));
        assertFalse("123 should not be a palindrome", PalindromeNumber.isPalindrome(123));
        assertFalse("1234 should not be a palindrome", PalindromeNumber.isPalindrome(1234));
    }

    @Test
    public void testNegativeNumbers() {
        // Test negative numbers
        assertFalse("Negative numbers should return false", PalindromeNumber.isPalindrome(-121));
        assertFalse("Negative numbers should return false", PalindromeNumber.isPalindrome(-11));
        assertFalse("Negative numbers should return false", PalindromeNumber.isPalindrome(-5));
    }

    @Test
    public void testLargePalindromeNumbers() {
        // Test large palindrome numbers
        assertTrue("1234321 should be a palindrome", PalindromeNumber.isPalindrome(1234321));
        assertTrue("1001 should be a palindrome", PalindromeNumber.isPalindrome(1001));
    }

    @Test
    public void testSingleDigitNumbers() {
        // Test single-digit numbers
        assertTrue("Single digit numbers are palindromes", PalindromeNumber.isPalindrome(1));
        assertTrue("Single digit numbers are palindromes", PalindromeNumber.isPalindrome(9));
        assertTrue("Single digit numbers are palindromes", PalindromeNumber.isPalindrome(7));
    }
}