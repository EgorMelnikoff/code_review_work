import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void dif() {
        assertEquals(4, calculator.dif(16, 12));
    }

    @Test
    void div() {
        assertEquals(4, calculator.div(16, 4));
    }

    @Test
    void times() {
        assertEquals(25, calculator.times(5, 5));
    }

    @Test
    void solver() {
        assertEquals(5, calculator.solver(5, 5, 5));
    }
}