package aaa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

    private calculator calculator;

    @Before
    public void setUp() {
        calculator = new calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        int a = 10, b = 5;
        int result = calculator.add(a, b);
        assertEquals(15, result);
    }
}