package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();
    
    @Test
    public void add(){
        assertEquals(2, calc.add(1, 1));
    }
    @Test
    public void div(){
        assertEquals(5, calc.div(10, 2));
    }
    @Test
    public void sum(){
        assertEquals(25, calc.sum(5, 5));
    }
    @Test
    public void sub(){
        assertEquals(8, calc.sub(10, 2));
    }
    @Test
    public void res(){
        assertEquals(1, calc.resto(10, 3));
    }
    @Test
    public void pot(){
        assertEquals(25, calc.poten( 5));
    }
}
