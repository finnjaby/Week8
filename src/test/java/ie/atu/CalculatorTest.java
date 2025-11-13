package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calc;

    //create calculator object for tests
    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAdd_Success(){
        assertEquals(20, calc.add(16,4));
    }
    @Test   //sum cannot be greater than max int value
    public void testAdd_Fail(){
        Exception ex = assertThrows(ArithmeticException.class,()->calc.add(Integer.MAX_VALUE,1));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE",ex.getMessage());
    }
    @Test
    public void testSub_Success(){
        assertEquals(3,calc.sub(8,5));
    }
    @Test   //difference cannot be smaller than min int value
    public void testSub_Fail(){
        Exception ex = assertThrows(ArithmeticException.class,()->calc.sub(Integer.MIN_VALUE,1));
        assertEquals("Number cannot be smaller than or equal to Integer.MIN_VALUE",ex.getMessage());
    }
    @Test
    public void testDiv_Success(){
        assertEquals(4,calc.div(8,2));
    }
    @Test   //cannot divide by zero
    public void testDiv_Fail(){
        Exception ex = assertThrows(ArithmeticException.class,()->calc.div(4,0));
        assertEquals("Cannot divide by Zero.",ex.getMessage());
    }
    @Test
    public void testMulti_Success(){
        assertEquals(12,calc.multi(3,4));
    }
    @Test   //product cannot be greater than max int value
    public void testMulti_Fail(){
        Exception ex = assertThrows(ArithmeticException.class,()->calc.multi(Integer.MAX_VALUE,2));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE",ex.getMessage());
    }
}
