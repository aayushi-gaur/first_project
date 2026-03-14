package firstjavapackage.runner;

import firstjavapackage.SimpleInterestCalculator;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

    public static void main (String[] argd) {
        SimpleInterestCalculator sicr = new SimpleInterestCalculator("4500.00", "7.5");
        BigDecimal totalSum = sicr.calculateTotalValue(5);
        System.out.println(totalSum);
    }
}
