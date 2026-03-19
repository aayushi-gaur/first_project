package firstjavapackage.runner;

import firstjavapackage.*;

import java.math.BigDecimal;

public class CalculatorRunner {

    public static void main(String[] args) {
/*
        Calculator menu = new Calculator();

        //calculator
        menu.calculateWithIf();

        //menu.calculatewithSwitch();


       //sum of squares
        SumOfSquares e = new SumOfSquares();
        System.out.println(e.calculateSumOfSquares(4));
        System.out.println(e.calculateSumOfSquares(-6));

        //simple interest calculator
        SimpleInterest sicr = new SimpleInterest("4500.00", "7.5");
        BigDecimal totalSum = sicr.calculateTotalValue(5);
        System.out.println(totalSum);

        //print table
        MultiplicationTable table = new MultiplicationTable();
        table.printMultiplicationTable();
        table.printMultiplicationTable(8);
        table.printMultiplicationTable(10,20, 30);

        //print sum of numbers upto N
        SumOfNNumbers sumN = new SumOfNNumbers();
        sumN.printSumUpToN(10);

        //print sum of divisors
        SumOfDivisors sumD = new SumOfDivisors(10);
        int sumOfDivisors = sumD.sumOfDivisors();
        System.out.println("Sum of divisors of 6 is " + sumOfDivisors);

        //square of numbers upto a limit
        SumOfSquares sqLimit = new SumOfSquares();
        sqLimit.squareUpToLimit(30);*/

        SumOfCubes  cubeLimit = new SumOfCubes();
        cubeLimit.cubeUpToLimit(30);

        cubeLimit.cubePrint();
    }
}
