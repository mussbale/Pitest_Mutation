package mathOperations;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
    private final StringUtil stringUtil = new StringUtil();

    @Test
    public void testReverse() {
        assertEquals("dcba", stringUtil.reverse("abcd"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtil.isPalindrome("madam"));
    }

    @Test
    public void testCalculateStringLength() {
        assertEquals(5, stringUtil.calculateStringLength("Hello"));
    }

    @Test
    public void testIsPrime() {
        assertTrue(stringUtil.isPrime(7));
    }

    @Test
    public void testIsPrime_NotPrime() {
        assertFalse(stringUtil.isPrime(10));
    }
}