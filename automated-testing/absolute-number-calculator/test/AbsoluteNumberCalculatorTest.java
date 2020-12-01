import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @org.junit.jupiter.api.Test
    void findAbsolute() {
        int number = 0;

        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);

        assertEquals(result,expected);
    }

    @Test
    void findAbsolute1() {
        int number = 1;

        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);

        assertEquals(result,expected);
    }

    @Test
    void findAbsolute2() {
        int number = -1;

        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);

        assertEquals(result,expected);
    }
}