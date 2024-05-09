import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftyNineShouldReturnF() {
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD() {
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }

    // we should do multiple scenarios to corroborate everything's fine

    @Test
    void negativeOneShouldReturnIllegalArgumentExcepcion() {
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
            grader.determineLetterGrade(-1);
                });
    }
}