package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAdd_Success(){
        assertEquals(20, calc.add(16,4));
    }
    @Test
    public void testSub_Success(){
        assertEquals(3,calc.sub(8,5));
    }
}
