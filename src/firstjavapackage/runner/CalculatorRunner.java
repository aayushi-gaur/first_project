package firstjavapackage.runner;

import firstjavapackage.Calculator;

import java.math.BigDecimal;

public class CalculatorRunner {

    public static void main(String[] args) {

        Calculator menu = new Calculator();

        //calculator
        menu.calculateWithIf();

        //menu.calculatewithSwitch();


       //sum of squares
        Calculator e = new Calculator();
        System.out.println(e.calculateSumOfSquares(4));
        System.out.println(e.calculateSumOfSquares(-6));

        //simple imterest calculator
        Calculator sicr = new Calculator("4500.00", "7.5");
        BigDecimal totalSum = sicr.calculateTotalValue(5);
        System.out.println(totalSum);

        //print table
        Calculator table = new Calculator();
        table.printMultiplicationTable();
        table.printMultiplicationTable(8);
        table.printMultiplicationTable(10,20, 30);
    }
}
