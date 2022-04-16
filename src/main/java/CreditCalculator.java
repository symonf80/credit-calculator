public class CreditCalculator {
    public int amountPerMonth(int loanAmount, double loanRate, int loanTerm) {
        double monthRate = (loanRate / 12) / 100;
        double annuityRate = monthRate * (Math.pow(1 + monthRate, loanTerm)) / ((Math.pow(1 + monthRate, loanTerm)) - 1);
        return (int) (loanAmount * annuityRate);
    }

    public int fullAmountReturn(int loanAmount, double loanRate, int loanTerm) {
        double monthRate = (loanRate / 12) / 100;
        double annuityRate = monthRate * (Math.pow(1 + monthRate, loanTerm)) / ((Math.pow(1 + monthRate, loanTerm)) - 1);
        return (int) ((loanAmount * annuityRate) * loanTerm);
    }

    public int overPayAmount(int loanAmount, double loanRate, int loanTerm) {
        double monthRate = (loanRate / 12) / 100;
        double annuityRate = monthRate * (Math.pow(1 + monthRate, loanTerm)) / ((Math.pow(1 + monthRate, loanTerm)) - 1);
        return (int) ((loanAmount * annuityRate) * loanTerm - loanAmount);
    }

    public static void main(String[] args) {
        int loanAmount = 700_000;
        double loanRate = 23;
        int loanTerm = 12;

        CreditCalculator calculator = new CreditCalculator();

        System.out.println("Ежемесячный платеж составляет " +
                calculator.amountPerMonth(loanAmount, loanRate, loanTerm)+" рублей.");
        System.out.println("Общая сумма кредита составляет " +
                calculator.fullAmountReturn(loanAmount, loanRate, loanTerm)+" рублей.");
        System.out.println("Переплата за весь период составляет "
                + calculator.overPayAmount(loanAmount, loanRate, loanTerm)+" рублей.");
    }
}
