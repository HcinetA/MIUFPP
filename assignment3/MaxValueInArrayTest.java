import org.junit.Test;
import static org.junit.Assert.*;

public class MaxValueInArrayTest {

    @Test
    public void testValidArray() {
        assertEquals(9, MaxValue.findMax(new int[]{5, -3, 6, 1, 9, 4}));
        assertEquals(6, MaxValue.findMax(new int[]{1, 2, 3, 6}));
        assertEquals(-1, MaxValue.findMax(new int[]{-10, -3, -1, -4}));
    }

    @Test
    public void testSingleElementArray() {
        assertEquals(5, MaxValue.findMax(new int[]{5}));
        assertEquals(-1, MaxValue.findMax(new int[]{-1}));
    }

    @Test
    public void testEmptyArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MaxValue.findMax(new int[]{});
        });
        assertEquals("Array must not be null or empty.", exception.getMessage());
    }

    @Test
    public void testNullArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MaxValue.findMax(null);
        });
        assertEquals("Array must not be null or empty.", exception.getMessage());
    }
}
