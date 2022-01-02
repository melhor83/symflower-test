package pan.symflower.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.Test;

/**
 * Tests i would write
 */
public class AppTest {

    @Test
    public void checkFib() {
        assertTrue(App.checkFib(5, new int[] {0, 1, 1, 2, 3}));
    }

    @Test
    public void checkFibInvalid() {
        assertFalse(App.checkFib(5, new int[] {0, 1, 1, 2, 4}));
    }
    
    @Test
    public void makeFib() {
        assertArrayEquals(new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, App.makeFib(10));
    }
}
