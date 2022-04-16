import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CreditCalculatorTest {
    private final int loanAmount = 700_000;
    private final double loanRate = 23;
    private final int loanTerm = 12;

    CreditCalculator calculator = new CreditCalculator();

    @Test
    void testAmountPerMonth() {
        int expected = 50_000;
        int actual = calculator.amountPerMonth(loanAmount, loanRate, loanTerm);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFullAmountReturn() {
        int expected = 800_000;
        int actual = calculator.fullAmountReturn(loanAmount, loanTerm, loanRate);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testOverPayAmount() {
        int expected = 100_000;
        int actual = calculator.overPayAmount(loanAmount, loanRate, loanTerm);
        Assertions.assertEquals(expected, actual);
    }
}
