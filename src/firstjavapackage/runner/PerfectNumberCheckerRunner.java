package firstjavapackage.runner;

import firstjavapackage.PerfectNumberChecker;

public class PerfectNumberCheckerRunner {

    public static void main(String[] args) {

        PerfectNumberChecker no = new PerfectNumberChecker();

        no.isPerfectNumber(6);
        no.isPerfectNumber(28);
        no.isPerfectNumber(5);
        no.isPerfectNumber(0);
    }

}
