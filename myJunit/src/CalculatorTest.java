import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void CalculatorInitialValue() {
        Calculator cal = new Calculator();

        assertEquals(1, cal.getValue());
    }
}