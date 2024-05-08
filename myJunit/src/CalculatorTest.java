import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void CalculatorInitialValue() {
        Calculator cal = new Calculator();

        assertEquals(0, cal.getValue());
    }

    @Test
    public void valueFiveWhenFiveAdded() {
        Calculator cal = new Calculator();
        cal.add(5);
        assertEquals(5,cal.getValue());
    }

    @Test
    public void valueMinusToWhenSubstract() {
        Calculator cal = new Calculator();
        cal.substract(2);
        assertEquals(-2, cal.getValue());
    }
}