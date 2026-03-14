package firstjavapackage.runner;

import firstjavapackage.MultiplicationTable;

public class MultiplicationTableRunner {
    public static void main (String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        table.printMultiplicationTable();
        table.printMultiplicationTable(8);
        table.printMultiplicationTable(10,20, 30);
    }
}
