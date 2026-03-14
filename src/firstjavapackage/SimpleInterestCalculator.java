package firstjavapackage;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    private BigDecimal principal, rate;
    public SimpleInterestCalculator(String principal, String rate) {
        this.principal = new BigDecimal(principal);
        this.rate = new BigDecimal(rate).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {
        return principal.add(principal.multiply(rate).multiply(new BigDecimal(noOfYears)));
    }
}
