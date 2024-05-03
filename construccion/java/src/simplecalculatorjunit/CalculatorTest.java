package simplecalculatorjunit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

class CalculatorTest {
    @Test
    public void CalculatorInitialValue() {
        Calculator cal = new Calculator();

        assertEquals(0, cal.getValue());
    }
}