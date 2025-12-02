import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    void dif() {
        assertEquals(3, calculator.dif(5, 2));
        assertEquals(-5, calculator.dif(5, 10));
    }

    @Test
    void div() {
        assertEquals(5, calculator.div(10, 2));
        assertEquals(2, calculator.div(5, 2));
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3));
        assertEquals(0, calculator.times(100, 0));
    }

    @Test
    void solver() {
        assertEquals(30, calculator.solver());
    }
}