
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCalculatorTest {
    private final int loanAmount = 700_000;
    private final double loanRate = 23;
    private final int loanTerm = 12;

    CreditCalculator calculator = new CreditCalculator();

    @Test
    void testAmountPerMonth() {
        int expected = 65_853;
        int actual = calculator.amountPerMonth(loanAmount, loanRate, loanTerm);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFullAmountReturn() {
        int expected = 790_241;
        int actual = calculator.fullAmountReturn(loanAmount,loanRate, loanTerm);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testOverPayAmount() {
        int expected = 90_241;
        int actual = calculator.overPayAmount(loanAmount, loanRate, loanTerm);
        Assertions.assertEquals(expected, actual);
    }
}
